package org.dbpedia.spotlight.uima.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
/**
 * Simple POJO for reading the spotlight annotation results from the REST server.
 * A resource represents a single candidate in the spotlight output.
 */
@Data
@XmlRootElement(name="resource")
@XmlAccessorType(XmlAccessType.NONE)
public class CandidateResource {
	
	@XmlAttribute
	private String uri;
	
	@XmlAttribute
	private Integer support;
	
	@XmlAttribute
	private String types;
	
	@XmlAttribute
	private Double finalScore;
	
	@XmlAttribute
	private Double percentageOfSecondRank;
	
	@XmlAttribute
	private String label;
	
	@XmlAttribute
	private Double contextualScore;
	
	@XmlAttribute
	private Double priorScore;
	
}
