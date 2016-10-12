package com.service.rest.goodreads.retrieve;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

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
	private static final String BASE_URL = "https://www.goodreads.com/search.xml?";
	// https://www.goodreads.com/search.xml?key=YOUR_KEY&q=Ender%27s+Game
	// https://www.goodreads.com/book/show/17050695.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ

	public GoodreadsBooksCatalogueResponse retrieveBooks(String keyword)
			throws ClientProtocolException, IOException, JAXBException {
		return getBooks(keyword);
	}

	private GoodreadsBooksCatalogueResponse getBooks(String keyword)
			throws ClientProtocolException, IOException, JAXBException {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet httpGetrequest = buildRetrieveCatalogueRequest(keyword);
		HttpResponse httpResponse = httpClient.execute(httpGetrequest);
		return UnMarshallRetrievedBooksCatalogue.unMarshallBooksCatalogue(httpResponse.getEntity().getContent());
	}

	private static String buildResourceCatalogueUrl(String keyword) {
		return BASE_URL + "key=" + KEY + "&q=" + keyword;

	}

	private static HttpGet buildRetrieveCatalogueRequest(String keyword)
			throws UnsupportedEncodingException, JAXBException {
		HttpGet getRequest = new HttpGet(buildResourceCatalogueUrl(keyword));
		getRequest.addHeader(HEADER_NAME, HEADER_VALUE);
		return getRequest;
	}

	public void checkcode() throws ClientProtocolException, IOException, UnsupportedOperationException, JAXBException {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet("https://www.goodreads.com/book/show/12082688.xml?key=uv1J3LcJ7zGuhzCXwaCcUQ");
		getRequest.addHeader(HEADER_NAME, HEADER_VALUE);
		HttpResponse httpResponse = httpClient.execute(getRequest);
		JAXBContext jaxbContext = JAXBContext.newInstance(GoodreadsRetrieveISBNResponse.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		GoodreadsRetrieveISBNResponse booksCatalogueResponse = (GoodreadsRetrieveISBNResponse) unmarshaller
				.unmarshal(httpResponse.getEntity().getContent());
		System.out.println(booksCatalogueResponse.getArtifact().getId());
		System.out.println(booksCatalogueResponse.getArtifact().getIsbn());
		System.out.println(booksCatalogueResponse.getArtifact().getIsbn13());
	}

	public static void main(String[] args) {
		try {
			System.out
					.println(new GoodreadsInfoRetrievalServiceImpl().getBooks("Ender%27s+Game").getRequest().getKey());
			new GoodreadsInfoRetrievalServiceImpl().checkcode();

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
