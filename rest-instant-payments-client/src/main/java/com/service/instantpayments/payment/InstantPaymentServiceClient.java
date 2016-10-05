package com.service.instantpayments.payment;

import javax.ws.rs.core.MediaType;

import com.rest.service.instantpayment.request.MakePaymentRequest;
import com.service.instantpayments.utils.Utils;
import com.sun.jersey.api.client.ClientResponse;

public class InstantPaymentServiceClient {
	private static final String PAYMENT_SERVICE = "http://localhost:8080/rest-instant-payments/InstantPaymentService/";

	public static void main(String[] args) {
		ClientResponse clientResponse = Utils.InvokeGetService(PAYMENT_SERVICE, "IsRunning", MediaType.TEXT_PLAIN);
		System.out.println(clientResponse.getEntity(String.class));

		MakePaymentRequest request = new MakePaymentRequest();
		request.setCardHolderName("Kalai");
		request.setCardNumber("1234432112344321");
		request.setCardSecurityCode(1234);
		request.setTransactionNumber("123BAR12");
		clientResponse = Utils.InvokePostService(PAYMENT_SERVICE, "MakePayment", MediaType.APPLICATION_XML, request);
		System.out.println(clientResponse.getEntity(String.class));

	}

}
