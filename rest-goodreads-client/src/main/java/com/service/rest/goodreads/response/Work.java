package com.service.rest.goodreads.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "work")
public class Work {
	private String id;
	private int booksCount;
	private int ratingsCount;
	private int textReviewsCount;
	private int originalPublicationYear;
	private int originalPublicationMonth;
	private int originalPublicationDay;
	private String averageRating;
	private Book book;

	public String getId() {
		return id;
	}

	@XmlElement(name = "id")
	public void setId(String id) {
		this.id = id;
	}

	public int getBooksCount() {
		return booksCount;
	}

	@XmlElement(name = "books_count")
	public void setBooksCount(int booksCount) {
		this.booksCount = booksCount;
	}

	public int getRatingsCount() {
		return ratingsCount;
	}

	@XmlElement(name = "ratings_count")
	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public int getTextReviewsCount() {
		return textReviewsCount;
	}

	@XmlElement(name = "text_reviews_count")
	public void setTextReviewsCount(int textReviewsCount) {
		this.textReviewsCount = textReviewsCount;
	}

	public int getOriginalPublicationYear() {
		return originalPublicationYear;
	}

	@XmlElement(name = "original_publication_year")
	public void setOriginalPublicationYear(int originalPublicationYear) {
		this.originalPublicationYear = originalPublicationYear;
	}

	public int getOriginalPublicationMonth() {
		return originalPublicationMonth;
	}

	@XmlElement(name = "original_publication_month")
	public void setOriginalPublicationMonth(int originalPublicationMonth) {
		this.originalPublicationMonth = originalPublicationMonth;
	}

	public int getOriginalPublicationDay() {
		return originalPublicationDay;
	}

	@XmlElement(name = "original_publication_day")
	public void setOriginalPublicationDay(int originalPublicationDay) {
		this.originalPublicationDay = originalPublicationDay;
	}

	public String getAverageRating() {
		return averageRating;
	}

	@XmlElement(name = "average_rating")
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public Book getBook() {
		return book;
	}

	@XmlElement(name = "best_book")
	public void setBook(Book book) {
		this.book = book;
	}

}
