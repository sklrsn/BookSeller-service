package com.service.bookstore.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "searchResult")
public class SearchResult {

	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	@XmlElement(name = "item")
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
