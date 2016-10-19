package com.service.instantpayments.payment;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;

import com.rest.service.instantpayment.request.MakePaymentRequest;
import com.rest.service.instapayment.marshalling.JAXBMarshaller;
import com.service.instantpayments.utils.Utils;

public class ProcessPayments {
	private static final String PAYMENT_SERVICE = "http://localhost:8080/rest-instant-payments/InstantPaymentService";

	public int processPayments(String cardNumber, String cardHolderName, int cardSecurityCode, String transactionNumber)
			throws JAXBException, Exception {

		MakePaymentRequest makePaymentRequest = new MakePaymentRequest();
		makePaymentRequest.setCardHolderName(cardHolderName);
		makePaymentRequest.setCardNumber(cardNumber);
		makePaymentRequest.setCardSecurityCode(cardSecurityCode);
		makePaymentRequest.setTransactionNumber(transactionNumber);

		HttpResponse response = Utils.InvokePostService(PAYMENT_SERVICE, "/MakePayment",
				JAXBMarshaller.buildMakePaymentRequest(makePaymentRequest), MediaType.APPLICATION_XML);
		return response.getStatusLine().getStatusCode();
	}

}
