package com.service.instantpayments.payment;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class ProcessPayments {
	private static final String PAYMENT_SERVICE = "http://localhost:8080/rest-instant-payments/InstantPaymentService";

	public int processPayments(String cardNumber, String cardHolderName, int cardSecurityCode, String transactionNumber)
			throws JAXBException, Exception {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(PAYMENT_SERVICE + "/ProcessPayement");
		HttpResponse response = client.execute(request);

		return response.getStatusLine().getStatusCode();
	}

}
