package com.service.instantpayments.payment;

import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.apache.http.HttpResponse;

import com.service.instantpayments.utils.Utils;
import com.sun.jersey.api.client.ClientResponse;

public class InstantPaymentServiceClient {
	private static final String PAYMENT_SERVICE = "http://localhost:8080/rest-instant-payments/InstantPaymentService";
	public static Logger LOGGER = Logger.getLogger("InstantPaymentServiceClient");

	public static void main(String[] args) {
		ClientResponse clientResponse = Utils.InvokeGetService(PAYMENT_SERVICE, "/IsRunning", MediaType.TEXT_PLAIN);
		LOGGER.info(clientResponse.getEntity(String.class));

		try {
			HttpResponse response = Utils.InvokePostService(PAYMENT_SERVICE, "/MakePayment");
			LOGGER.info("Status:" + response.getStatusLine().getStatusCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
