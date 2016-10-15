package com.service.bookstore.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sellingStatus")
public class SellingStatus {
	private String currentPrice;
	private String convertedCurrentPrice;
	private String sellingState;
	private String timeLeft;

	public String getCurrentPrice() {
		return currentPrice;
	}

	@XmlElement(name = "currentPrice")
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getConvertedCurrentPrice() {
		return convertedCurrentPrice;
	}

	@XmlElement(name = "convertedCurrentPrice")
	public void setConvertedCurrentPrice(String convertedCurrentPrice) {
		this.convertedCurrentPrice = convertedCurrentPrice;
	}

	public String getSellingState() {
		return sellingState;
	}

	@XmlElement(name = "sellingState")
	public void setSellingState(String sellingState) {
		this.sellingState = sellingState;
	}

	public String getTimeLeft() {
		return timeLeft;
	}

	@XmlElement(name = "timeLeft")
	public void setTimeLeft(String timeLeft) {
		this.timeLeft = timeLeft;
	}

}
