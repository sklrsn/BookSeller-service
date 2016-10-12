package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Artifact {
	private String id;
	private String title;
	private String isbn;
	private String isbn13;
	private String imageUrl;
	private String smallImageUrl;
	private String publicationYear;
	private String publicationMonth;
	private String publicationDay;
	private String publisher;
	private String averageRating;
	private String noOfpages;
	private String format;
	private String ratingsCount;
	private String textReviewsCount;
	private String description;
	private Authors authors;

	public String getId() {
		return id;
	}

	@XmlElement(name = "id")
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	@XmlElement(name = "isbn")
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn13() {
		return isbn13;
	}

	@XmlElement(name = "isbn13")
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
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

	public String getPublicationYear() {
		return publicationYear;
	}

	@XmlElement(name = "publication_year")
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublicationMonth() {
		return publicationMonth;
	}

	@XmlElement(name = "publication_month")
	public void setPublicationMonth(String publicationMonth) {
		this.publicationMonth = publicationMonth;
	}

	public String getPublicationDay() {
		return publicationDay;
	}

	@XmlElement(name = "publication_day")
	public void setPublicationDay(String publicationDay) {
		this.publicationDay = publicationDay;
	}

	public String getPublisher() {
		return publisher;
	}

	@XmlElement(name = "publisher")
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAverageRating() {
		return averageRating;
	}

	@XmlElement(name = "average_rating")
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public String getNoOfpages() {
		return noOfpages;
	}

	@XmlElement(name = "num_pages")
	public void setNoOfpages(String noOfpages) {
		this.noOfpages = noOfpages;
	}

	public String getFormat() {
		return format;
	}

	@XmlElement(name = "format")
	public void setFormat(String format) {
		this.format = format;
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

	public String getDescription() {
		return description;
	}

	@XmlElement(name = "description")
	public void setDescription(String description) {
		this.description = description;
	}

	public Authors getAuthors() {
		return authors;
	}

	@XmlElement(name = "authors")
	public void setAuthors(Authors authors) {
		this.authors = authors;
	}

}
