package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GoodreadsResponse")
public class GoodreadsRetrieveISBNResponse {
	private Request request;
	private Artifact artifact;

	public Request getRequest() {
		return request;
	}

	@XmlElement(name = "Request")
	public void setRequest(Request request) {
		this.request = request;
	}

	public Artifact getArtifact() {
		return artifact;
	}

	@XmlElement(name = "book")
	public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}

}
