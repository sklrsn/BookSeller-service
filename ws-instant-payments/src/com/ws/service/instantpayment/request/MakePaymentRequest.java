package com.ws.service.instantpayment.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MakePaymentRequest {
	private String transactionNumber;
	private String cardNumber;
	private String cardHolderName;
	private int CardSecurityCode;

	public String getTransactionNumber() {
		return transactionNumber;
	}

	@XmlElement
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	@XmlElement
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	@XmlElement
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public int getCardSecurityCode() {
		return CardSecurityCode;
	}

	@XmlElement
	public void setCardSecurityCode(int cardSecurityCode) {
		CardSecurityCode = cardSecurityCode;
	}

}
