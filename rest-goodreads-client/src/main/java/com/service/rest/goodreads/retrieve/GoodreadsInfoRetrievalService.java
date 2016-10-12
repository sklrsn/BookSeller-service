package com.service.rest.goodreads.retrieve;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;

import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;

public interface GoodreadsInfoRetrievalService {

	GoodreadsBooksCatalogueResponse retrieveBooks(String keyword)
			throws ClientProtocolException, IOException, JAXBException;

}
