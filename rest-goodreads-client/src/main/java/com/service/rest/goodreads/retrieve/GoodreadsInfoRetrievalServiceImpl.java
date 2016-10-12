package com.service.rest.goodreads.retrieve;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.service.rest.goodreads.parser.UnMarshallRetrievedBooksCatalogue;
import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;
import com.service.rest.goodreads.response.GoodreadsRetrieveISBNResponse;

public class GoodreadsInfoRetrievalServiceImpl implements GoodreadsInfoRetrievalService {
	private static final String HEADER_VALUE = "application/xml";
	private static final String HEADER_NAME = "accept";
	private static final String KEY = "uv1J3LcJ7zGuhzCXwaCcUQ";
	private static final String AUTH_CODE = "QT7rbUZI5usLKYL24i5H1KrNJYN52cBpGRbPHNaVI";
	private static final String BASE_URL = "https://www.goodreads.com/";
	// https://www.goodreads.com/search.xml?key=YOUR_KEY&q=Ender%27s+Game
	// https://www.goodreads.com/book/show/17050695.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ

	public GoodreadsBooksCatalogueResponse retrieveBooksbyKeyword(String keyword)
			throws ClientProtocolException, IOException, JAXBException {
		return getBooks(keyword);
	}

	private GoodreadsBooksCatalogueResponse getBooks(String keyword)
			throws ClientProtocolException, IOException, JAXBException {
		HttpClient httpClient = getHttpClientInstance();
		HttpGet httpGetrequest = buildHttpGetRequest(buildResourceCatalogueUrl(keyword));
		HttpResponse httpResponse = httpClient.execute(httpGetrequest);
		return UnMarshallRetrievedBooksCatalogue.unMarshallBooksCatalogue(httpResponse.getEntity().getContent());
	}

	public GoodreadsRetrieveISBNResponse retrieveBookbyId(String bookId)
			throws ClientProtocolException, IOException, UnsupportedOperationException, JAXBException {
		HttpClient httpClient = getHttpClientInstance();
		HttpGet getRequest = buildHttpGetRequest(buildISBNretrievalUrl(bookId));
		HttpResponse httpResponse = httpClient.execute(getRequest);
		return UnMarshallRetrievedBooksCatalogue.unMarshallISBNstream(httpResponse.getEntity().getContent());
	}

	private HttpClient getHttpClientInstance() {
		HttpClient httpClient = HttpClientBuilder.create().build();
		return httpClient;
	}

	private static String buildResourceCatalogueUrl(String keyword) {
		return BASE_URL + "search.xml?key=" + KEY + "&q=" + keyword;

	}

	private static String buildISBNretrievalUrl(String bookId) {
		return BASE_URL + "book/show/" + bookId + ".xml" + "?key=" + KEY;

	}

	private static HttpGet buildHttpGetRequest(String resourceUrl) throws UnsupportedEncodingException, JAXBException {
		HttpGet getRequest = new HttpGet(resourceUrl);
		getRequest.addHeader(HEADER_NAME, HEADER_VALUE);
		return getRequest;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new GoodreadsInfoRetrievalServiceImpl().getBooks("Ender%27s+Game").getSearch()
					.getResults().getResultList().get(0).getId());
			System.out.println(
					new GoodreadsInfoRetrievalServiceImpl().retrieveBookbyId("17050695").getArtifact().getIsbn13());

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
