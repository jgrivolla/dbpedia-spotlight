package org.dbpedia.spotlight.uima;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.dbpedia.spotlight.uima.response.CandidateAnnotation;
import org.dbpedia.spotlight.uima.response.CandidateResource;
import org.dbpedia.spotlight.uima.response.CandidateSurfaceForm;
import org.dbpedia.spotlight.uima.types.DBpediaResource;
import org.dbpedia.spotlight.uima.types.TopDBpediaResource;
import org.xml.sax.SAXException;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;


/**
 * Wrapper for the DbpediaSpotlight Annotate Web Service. This annotator assumes that the
 * web service endpoint specified in the configuration has already been started.
 * 
 * The annotator has no input size limitation, 
 * however it assumes the input is structured as one sentence at a line.
 * This is not a strict requirement though,
 * the annotator would still work fine as long as there are no lines containing extra-long text.
 *   
 * @author Mustafa Nural
 */
public class SpotlightAnnotator extends JCasAnnotator_ImplBase {

	Logger LOG = Logger.getLogger(this.getClass());

	/**
	 * The endpoint for Spotlight Annotate service
	 */
	public static final String PARAM_ENDPOINT = "endPoint";
	@ConfigurationParameter(name=PARAM_ENDPOINT, defaultValue="http://spotlight.dbpedia.org/rest/", description="The endpoint for Spotlight Annotate service")
	private String SPOTLIGHT_ENDPOINT;

	public static final String PARAM_CONFIDENCE = "confidence";
	@ConfigurationParameter(name=PARAM_CONFIDENCE, defaultValue="0.0")
	private double CONFIDENCE;
	public static final String PARAM_SUPPORT = "support";
	@ConfigurationParameter(name=PARAM_SUPPORT, defaultValue="0")
	private int SUPPORT;
	public static final String PARAM_TYPES = "types";
	@ConfigurationParameter(name=PARAM_TYPES, defaultValue="")
	private String TYPES;
	public static final String PARAM_SPARQL = "sparql";
	@ConfigurationParameter(name=PARAM_SPARQL, defaultValue="")
	private String SPARQL;
	public static final String PARAM_POLICY = "policy";
	@ConfigurationParameter(name=PARAM_POLICY, defaultValue="whitelist")
	private String POLICY;
	public static final String PARAM_COREFERENCE_RESOLUTION = "coferenceResolution";
	@ConfigurationParameter(name=PARAM_COREFERENCE_RESOLUTION, defaultValue="true")
	private boolean COREFERENCE_RESOLUTION;
	public static final String PARAM_SPOTTER = "spotter";
	@ConfigurationParameter(name=PARAM_SPOTTER, defaultValue="Default")
	private String SPOTTER;
	public static final String PARAM_DISAMBIGUATOR = "disambiguator";
	@ConfigurationParameter(name=PARAM_DISAMBIGUATOR, defaultValue="Default")
	private String DISAMBIGUATOR;
	public static final String PARAM_ALL_CANDIDATES = "allCandidates";
	@ConfigurationParameter(name=PARAM_ALL_CANDIDATES, defaultValue="false", description="output all candidate annotations")
	private boolean ALL_CANDIDATES;

	private final int BATCH_SIZE = 10; 

	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		ScoreComparator scoreComparator = new ScoreComparator(); 
		
		String documentText = aJCas.getDocumentText();

		// don't query endpoint without text
		if (StringUtils.isBlank(documentText)) {
			return;
		}

		Client c = Client.create();

		BufferedReader documentReader = new BufferedReader(new StringReader(documentText));
		//Send requests to the server by dividing the document into sentence chunks determined by BATCH_SIZE.
		int documentOffset = 0;
		int numLines = 0;
		boolean moreLines = true;
		while (moreLines){
			String request = "";
			for (int index = 0; index < BATCH_SIZE; index++) {
				String line = null;
				try {
					line = documentReader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					LOG.error("Can't read from input file",e);
				}
				if (line == null) {
					moreLines = false;
					break;
				}else if (index !=0){
					request += "\n";
				}
				request += line;
				numLines++;
			}
			if (StringUtils.isBlank(request)) {
				continue;
			}

			CandidateAnnotation response = null;
			boolean retry = false;
			int retryCount = 0;
			do{
				try{

					LOG.debug("Sending request to the server");

					Form form = new Form();
					form.add("text", request);
					form.add("confidence", "" + CONFIDENCE);
					form.add("support", "" + SUPPORT);
					form.add("types", TYPES);
					form.add("sparql", SPARQL);
					form.add("policy", POLICY);
					form.add("coreferenceResolution", Boolean.toString(COREFERENCE_RESOLUTION));
					form.add("spotter", SPOTTER);
					form.add("disambiguator", DISAMBIGUATOR);
					
					WebResource r = 
							c.resource(SPOTLIGHT_ENDPOINT+"/candidates");
					LOG.debug(r.getURI());
					LOG.debug(form);
					response =
							r.type("application/x-www-form-urlencoded;charset=UTF-8")
							.accept(MediaType.TEXT_XML)
							.post(CandidateAnnotation.class, form);
					retry = false;
				} catch (Exception e){
					//In case of a failure, try sending the request with a 2 second delay at least three times before throwing an exception
					LOG.error("Server request failed. Will try again in 2 seconds..", e);
					LOG.error("Failed request payload: " +request);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						LOG.error("Thread interrupted",e1);
					}
					if (retryCount++ < 3){
						retry = true;	
					} else {
						throw new AnalysisEngineProcessException("The server request failed", null);
					}
				}
			}while(retry);

			LOG.debug("Server request completed. Writing to the index");
			/*
			 * Add the results to the AnnotationIndex
			 */
			for (CandidateSurfaceForm surfaceForm : response.getSurfaceForms()) {
				Integer begin = documentOffset + surfaceForm.getOffset();
				Integer end = begin + surfaceForm.getName().length();
				LOG.debug("surfaceForm: " + surfaceForm.getName());
				Boolean isFirst = true;
				List<CandidateResource> resources = surfaceForm.getResources();
				Collections.sort(resources, scoreComparator);
				for (CandidateResource resource : resources) {
					DBpediaResource res;
					if (isFirst) {
						res = new TopDBpediaResource(aJCas);
					} else {
						res = new DBpediaResource(aJCas);
					}
					res.setBegin(begin);
					res.setEnd(end);
					res.setFinalScore(resource.getFinalScore());
					res.setTypes(resource.getTypes());
					res.setSupport(resource.getSupport());
					res.setUri(resource.getUri());
					res.setLabel(resource.getLabel());
					res.setPercentageOfSecondRank(resource.getPercentageOfSecondRank());
					res.setPriorScore(resource.getPriorScore());
					res.setContextualScore(resource.getContextualScore());
					LOG.debug("resource:\n" + res.toString(2) + "\n\n");
					res.addToIndexes(aJCas);
					if (!ALL_CANDIDATES) break; // only return best candidate
					isFirst = false;
				}
			}

			documentOffset += request.length() + 1 ;

		}
		try {
			documentReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public class ScoreComparator implements Comparator<CandidateResource> {
		public int compare(CandidateResource c1, CandidateResource c2) {
			return (c2.getFinalScore().compareTo(c1.getFinalScore()));
		}
	}

	
	
	/**
	 * return example descriptor (XML) when calling main method
	 * @param args not used
	 * @throws ResourceInitializationException
	 * @throws FileNotFoundException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static void main(String[] args) throws ResourceInitializationException, FileNotFoundException, SAXException, IOException {
		AnalysisEngineFactory.createEngineDescription(SpotlightAnnotator.class).toXML(System.out);
	}
}
