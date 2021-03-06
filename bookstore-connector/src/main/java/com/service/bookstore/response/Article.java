package com.service.bookstore.response;

public class Article {
	// for goodreads
	private String id;
	private String title;
	private String imageUrl;
	private String publicationYear;
	private String averageRating;
	private String ratingsCount;
	private String author;
	private String isbn;
	private String isbn13;
	private String description;
	// for ebay
	private String currentPrice;
	private String isAvailableForPurchase;
	private String shippingServiceCost;
	private String ebayUrl;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public String getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(String ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public String getAuthors() {
		return author;
	}

	public void setAuthors(String author) {
		this.author = author;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getIsAvailableForPurchase() {
		return isAvailableForPurchase;
	}

	public void setIsAvailableForPurchase(String isAvailableForPurchase) {
		this.isAvailableForPurchase = isAvailableForPurchase;
	}

	public String getShippingServiceCost() {
		return shippingServiceCost;
	}

	public void setShippingServiceCost(String shippingServiceCost) {
		this.shippingServiceCost = shippingServiceCost;
	}

	public String getEbayUrl() {
		return ebayUrl;
	}

	public void setEbayUrl(String ebayUrl) {
		this.ebayUrl = ebayUrl;
	}

}
