package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "listingInfo")
public class ListingInfo {
	private String bestOfferEnabled;
	private String buyItNowAvailable;
	private String startTime;
	private String endTime;
	private String listingType;
	private String gift;

	public String getBestOfferEnabled() {
		return bestOfferEnabled;
	}

	@XmlElement(name = "bestOfferEnabled")
	public void setBestOfferEnabled(String bestOfferEnabled) {
		this.bestOfferEnabled = bestOfferEnabled;
	}

	public String getBuyItNowAvailable() {
		return buyItNowAvailable;
	}

	@XmlElement(name = "buyItNowAvailable")
	public void setBuyItNowAvailable(String buyItNowAvailable) {
		this.buyItNowAvailable = buyItNowAvailable;
	}

	public String getStartTime() {
		return startTime;
	}

	@XmlElement(name = "startTime")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	@XmlElement(name = "endTime")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getListingType() {
		return listingType;
	}

	@XmlElement(name = "listingType")
	public void setListingType(String listingType) {
		this.listingType = listingType;
	}

	public String getGift() {
		return gift;
	}

	@XmlElement(name = "gift")
	public void setGift(String gift) {
		this.gift = gift;
	}

}
