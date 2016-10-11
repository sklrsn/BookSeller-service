package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GoodreadsResponse")
public class GoodreadsBooksCatalogueResponse {
	private Request request;
	private Search search;

	public Request getRequest() {
		return request;
	}

	@XmlElement(name = "Request")
	public void setRequest(Request request) {
		this.request = request;
	}

	public Search getSearch() {
		return search;
	}

	@XmlElement(name = "search")
	public void setSearch(Search search) {
		this.search = search;
	}

}
