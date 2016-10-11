package com.service.rest.goodreads.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search")
public class Search {
	private String query;
	private String resultsStart;
	private String resultsEnd;
	private String totalResults;
	private String source;
	private String queryTimeSeconds;
	private Results results;

	public String getQuery() {
		return query;
	}

	@XmlElement(name = "query")
	public void setQuery(String query) {
		this.query = query;
	}

	public String getResultsStart() {
		return resultsStart;
	}

	@XmlElement(name = "results-start")
	public void setResultsStart(String resultsStart) {
		this.resultsStart = resultsStart;
	}

	public String getResultsEnd() {
		return resultsEnd;
	}

	@XmlElement(name = "results-end")
	public void setResultsEnd(String resultsEnd) {
		this.resultsEnd = resultsEnd;
	}

	public String getTotalResults() {
		return totalResults;
	}

	@XmlElement(name = "total-results")
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public String getSource() {
		return source;
	}

	@XmlElement(name = "source")
	public void setSource(String source) {
		this.source = source;
	}

	public String getQueryTimeSeconds() {
		return queryTimeSeconds;
	}

	@XmlElement(name = "query-time-seconds")
	public void setQueryTimeSeconds(String queryTimeSeconds) {
		this.queryTimeSeconds = queryTimeSeconds;
	}

	public Results getResults() {
		return results;
	}

	@XmlElement(name = "results")
	public void setResults(Results results) {
		this.results = results;
	}

}
