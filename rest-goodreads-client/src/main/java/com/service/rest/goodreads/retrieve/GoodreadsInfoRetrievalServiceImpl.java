package com.service.rest.goodreads.retrieve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.service.rest.goodreads.parser.UnMarshallRetrievedBooksCatalogue;
import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;

public class GoodreadsInfoRetrievalServiceImpl implements GoodreadsInfoRetrievalService {
	private static final String HEADER_VALUE = "application/xml";
	private static final String HEADER_NAME = "accept";
	private static final String KEY = "uv1J3LcJ7zGuhzCXwaCcUQ";
	private static final String AUTH_CODE = "QT7rbUZI5usLKYL24i5H1KrNJYN52cBpGRbPHNaVI";
	private static final String BASE_URL = "https://www.goodreads.com/search.xml?";
	// https://www.goodreads.com/search.xml?key=YOUR_KEY&q=Ender%27s+Game

	public void retrievebooks(String keyword) throws ClientProtocolException, IOException, JAXBException {
		HttpResponse httpResponse = getBooks(keyword);
		System.out.println("#############" + httpResponse.getStatusLine().getStatusCode());

	}

	private HttpResponse getBooks(String keyword) throws ClientProtocolException, IOException, JAXBException {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet httpGetrequest = buildGetRequest(keyword);
		HttpResponse httpResponse = httpClient.execute(httpGetrequest);
		
		//System.out.println(httpResponse.getStatusLine().getStatusCode());
		// BufferedReader bufferedReader = new BufferedReader(
		// new InputStreamReader(httpResponse.getEntity().getContent()));
		// String read;
		// while ((read = bufferedReader.readLine()) != null) {
		// System.out.println(read);
		// }
		GoodreadsBooksCatalogueResponse booksCatalogueResponse = UnMarshallRetrievedBooksCatalogue
				.unMarshallBooksCatalogue(httpResponse.getEntity().getContent());
		return httpResponse;
	}

	private static String buildResourceUrl(String keyword) {
		return BASE_URL + "key=" + KEY + "&q=" + keyword;

	}

	private static HttpGet buildGetRequest(String keyword) throws UnsupportedEncodingException, JAXBException {
		HttpGet getRequest = new HttpGet(buildResourceUrl(keyword));
		getRequest.addHeader(HEADER_NAME, HEADER_VALUE);
		return getRequest;
	}

	public static void main(String[] args) {
		try {
			new GoodreadsInfoRetrievalServiceImpl().getBooks("Ender%27s+Game");
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}