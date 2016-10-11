package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Request")
public class Request {
	private String authentication;
	private String key;
	private String method;

	public String getAuthentication() {
		return authentication;
	}

	@XmlElement(name = "authentication")
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	public String getKey() {
		return key;
	}

	@XmlElement(name = "key")
	public void setKey(String key) {
		this.key = key;
	}

	public String getMethod() {
		return method;
	}

	@XmlElement(name = "method")
	public void setMethod(String method) {
		this.method = method;
	}

}
