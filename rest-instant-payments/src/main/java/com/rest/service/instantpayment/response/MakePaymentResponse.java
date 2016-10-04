package com.rest.service.instantpayment.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MakePaymentResponse {

	Boolean isProcessed;

	public Boolean getIsProcessed() {
		return isProcessed;
	}

	@XmlElement
	public void setIsProcessed(Boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

}
