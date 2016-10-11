package com.service.rest.goodreads.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "results")
public class Results {

	private List<Work> resultList;

	public List<Work> getResultList() {
		return resultList;
	}

	@XmlElement(name = "work")
	public void setResultList(List<Work> resultList) {
		this.resultList = resultList;
	}

}
