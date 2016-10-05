package com.service.instantpayments.utils;

import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

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

	public static HttpResponse InvokePostService(String resource, String serviceName, String request, String mediaType)
			throws Exception {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost postRequest = buildPostRequest(resource, serviceName, request, mediaType);
		HttpResponse response = httpClient.execute(postRequest);
		return response;
	}

	private static HttpPost buildPostRequest(String resource, String serviceName, String request, String mediaType)
			throws UnsupportedEncodingException, JAXBException {
		HttpPost postRequest = new HttpPost(resource + serviceName);
		StringEntity input = new StringEntity(request);
		input.setContentType(mediaType);
		postRequest.setEntity(input);
		return postRequest;
	}
}
