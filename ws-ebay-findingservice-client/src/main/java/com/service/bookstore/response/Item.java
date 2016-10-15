package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item {
	private String itemId;
	private String title;
	private String globalId;
	private PrimaryCategory primaryCategory;
	private String viewItemURL;
	private String paymentMethod;
	private String location;
	private String country;
	private ShippingInfo shippingInfo;
	private SellingStatus sellingStatus;
	private ListingInfo listingInfo;
	private String returnsAccepted;
	private String isMultiVariationListing;
	private String topRatedListing;

	public String getItemId() {
		return itemId;
	}

	@XmlElement(name = "itemId")
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGlobalId() {
		return globalId;
	}

	@XmlElement(name = "globalId")
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public PrimaryCategory getPrimaryCategory() {
		return primaryCategory;
	}

	@XmlElement(name = "primaryCategory")
	public void setPrimaryCategory(PrimaryCategory primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public String getViewItemURL() {
		return viewItemURL;
	}

	@XmlElement(name = "viewItemURL")
	public void setViewItemURL(String viewItemURL) {
		this.viewItemURL = viewItemURL;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	@XmlElement(name = "paymentMethod")
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getLocation() {
		return location;
	}

	@XmlElement(name = "location")
	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement(name = "country")
	public void setCountry(String country) {
		this.country = country;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	@XmlElement(name = "shippingInfo")
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public SellingStatus getSellingStatus() {
		return sellingStatus;
	}

	@XmlElement(name = "sellingStatus")
	public void setSellingStatus(SellingStatus sellingStatus) {
		this.sellingStatus = sellingStatus;
	}

	public ListingInfo getListingInfo() {
		return listingInfo;
	}

	@XmlElement(name = "listingInfo")
	public void setListingInfo(ListingInfo listingInfo) {
		this.listingInfo = listingInfo;
	}

	public String getReturnsAccepted() {
		return returnsAccepted;
	}

	@XmlElement(name = "returnsAccepted")
	public void setReturnsAccepted(String returnsAccepted) {
		this.returnsAccepted = returnsAccepted;
	}

	public String getIsMultiVariationListing() {
		return isMultiVariationListing;
	}

	@XmlElement(name = "isMultiVariationListing")
	public void setIsMultiVariationListing(String isMultiVariationListing) {
		this.isMultiVariationListing = isMultiVariationListing;
	}

	public String getTopRatedListing() {
		return topRatedListing;
	}

	@XmlElement(name = "topRatedListing")
	public void setTopRatedListing(String topRatedListing) {
		this.topRatedListing = topRatedListing;
	}

}
