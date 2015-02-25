package org.dbpedia.spotlight.uima.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
/**
 * Simple POJO for reading the spotlight annotation results from the REST server.
 * A SurfaceForm represents a span in the original text that has resource candidates.
 */
@Data
@XmlRootElement(name="surfaceForm")
@XmlAccessorType(XmlAccessType.NONE)
public class CandidateSurfaceForm {

	@XmlElement(name="resource")
	private List<CandidateResource> resources = new ArrayList<CandidateResource>();
	
	@XmlAttribute(name="name")
	private String name;

	@XmlAttribute(name="offset")
	private Integer offset;

}
