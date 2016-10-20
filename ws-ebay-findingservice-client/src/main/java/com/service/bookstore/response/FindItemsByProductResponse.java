package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "findItemsByProductResponse", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByProductResponse {

	private String ack;
	private SearchResult searchResult;
	private String version;
	private String timestamp;

	public String getAck() {
		return ack;
	}

	@XmlElement(name = "ack")
	public void setAck(String ack) {
		this.ack = ack;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	@XmlElement(name = "searchResult")
	public void setSearchResult(SearchResult searchResult) {
		this.searchResult = searchResult;
	}

	public String getVersion() {
		return version;
	}

	@XmlElement(name = "version")
	public void setVersion(String version) {
		this.version = version;
	}

	public String getTimestamp() {
		return timestamp;
	}

	@XmlElement(name = "timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
