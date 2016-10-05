package com.service.instantpayments.utils;

import javax.ws.rs.core.MediaType;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.rest.service.instapayment.marshalling.JAXBMarshaller;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Utils {
	public static ClientResponse InvokeGetService(String resource, String serviceName, String mediaType) {
		ClientResponse response = getWebResource(resource, serviceName).accept(mediaType).get(ClientResponse.class);
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

	public static HttpResponse InvokePostService(String resource, String serviceName) throws Exception {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost postRequest = new HttpPost(resource + serviceName);
		StringEntity input = null;
		input = new StringEntity(JAXBMarshaller.buildMakePaymentRequest());
		input.setContentType(MediaType.APPLICATION_XML);
		postRequest.setEntity(input);
		HttpResponse response = httpClient.execute(postRequest);
		return response;
	}
}
