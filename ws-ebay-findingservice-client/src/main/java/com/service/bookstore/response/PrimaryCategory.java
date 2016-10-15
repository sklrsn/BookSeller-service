package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "primaryCategory")
public class PrimaryCategory {

	private String categoryId;
	private String categoryName;

	public String getCategoryId() {
		return categoryId;
	}

	@XmlElement(name = "categoryId")
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	@XmlElement(name = "categoryName")
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
