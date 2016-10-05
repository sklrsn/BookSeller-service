package com.service.instantpayments.utils;

import com.rest.service.instantpayment.request.MakePaymentRequest;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Utils {
	public static ClientResponse InvokeGetService(String resource, String serviceName, String mediaType) {
		ClientResponse response = getWebResource(resource, serviceName).accept(mediaType).get(ClientResponse.class);
		validateResponseCode(response);
		return response;
	}

	public static ClientResponse InvokePostService(String resource, String serviceName, String mediaType,
			MakePaymentRequest request) {
		ClientResponse response = getWebResource(resource, serviceName).accept(mediaType).post(ClientResponse.class,
				request);
		validateResponseCode(response);
		return response;
	}

	private static void validateResponseCode(ClientResponse response) {
		if (response.getStatus() != 200) {
			throw new RuntimeException(String.valueOf(response.getStatus()));
		}
	}

	private static WebResource getWebResource(String resource, String serviceName) {
		WebResource webResource = Client.create().resource(resource + serviceName);
		return webResource;
	}
}
