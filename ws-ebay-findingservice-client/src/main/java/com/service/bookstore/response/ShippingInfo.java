package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shippingInfo")
public class ShippingInfo {
	private String shippingServiceCost;
	private String shippingType;
	private String shipToLocations;
	private String expeditedShipping;
	private String oneDayShippingAvailable;
	private String handlingTime;

	public String getShippingServiceCost() {
		return shippingServiceCost;
	}

	@XmlElement(name = "shippingServiceCost")
	public void setShippingServiceCost(String shippingServiceCost) {
		this.shippingServiceCost = shippingServiceCost;
	}

	public String getShippingType() {
		return shippingType;
	}

	@XmlElement(name = "shippingType")
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getShipToLocations() {
		return shipToLocations;
	}

	@XmlElement(name = "shipToLocations")
	public void setShipToLocations(String shipToLocations) {
		this.shipToLocations = shipToLocations;
	}

	public String getExpeditedShipping() {
		return expeditedShipping;
	}

	@XmlElement(name = "expeditedShipping")
	public void setExpeditedShipping(String expeditedShipping) {
		this.expeditedShipping = expeditedShipping;
	}

	public String getOneDayShippingAvailable() {
		return oneDayShippingAvailable;
	}

	@XmlElement(name = "oneDayShippingAvailable")
	public void setOneDayShippingAvailable(String oneDayShippingAvailable) {
		this.oneDayShippingAvailable = oneDayShippingAvailable;
	}

	public String getHandlingTime() {
		return handlingTime;
	}

	@XmlElement(name = "handlingTime")
	public void setHandlingTime(String handlingTime) {
		this.handlingTime = handlingTime;
	}

}
