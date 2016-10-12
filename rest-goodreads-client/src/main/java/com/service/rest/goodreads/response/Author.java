package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "author")
public class Author {
	private int id;
	private String name;
	private String imageUrl;
	private String smallImageUrl;
	private String link;
	private String averageRating;
	private String ratingsCount;
	private String textReviewsCount;

	public int getId() {
		return id;
	}

	@XmlElement(name = "id")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	@XmlElement(name = "image_url")
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	@XmlElement(name = "small_image_url")
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}

	public String getLink() {
		return link;
	}

	@XmlElement(name = "link")
	public void setLink(String link) {
		this.link = link;
	}

	public String getAverageRating() {
		return averageRating;
	}

	@XmlElement(name = "average_rating")
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public String getRatingsCount() {
		return ratingsCount;
	}

	@XmlElement(name = "ratings_count")
	public void setRatingsCount(String ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public String getTextReviewsCount() {
		return textReviewsCount;
	}

	@XmlElement(name = "text_reviews_count")
	public void setTextReviewsCount(String textReviewsCount) {
		this.textReviewsCount = textReviewsCount;
	}

}
