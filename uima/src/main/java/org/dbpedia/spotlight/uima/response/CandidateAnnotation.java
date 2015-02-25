package org.dbpedia.spotlight.uima.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
/**
 * POJO for reading the spotlight annotation results from the REST server.
 */
@Data
@XmlRootElement(name ="annotation")
@XmlAccessorType(XmlAccessType.NONE)
public class CandidateAnnotation {

	@XmlElement(name="surfaceForm")
	private List<CandidateSurfaceForm> surfaceForms = new ArrayList<CandidateSurfaceForm>();

}
