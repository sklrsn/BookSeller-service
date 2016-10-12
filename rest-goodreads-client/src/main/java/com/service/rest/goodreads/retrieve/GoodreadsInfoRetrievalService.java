package com.service.rest.goodreads.retrieve;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;

import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;
import com.service.rest.goodreads.response.GoodreadsRetrieveISBNResponse;

public interface GoodreadsInfoRetrievalService {

	GoodreadsBooksCatalogueResponse retrieveBooksbyKeyword(String keyword)
			throws ClientProtocolException, IOException, JAXBException;

	GoodreadsRetrieveISBNResponse retrieveBookbyId(String bookId)
			throws ClientProtocolException, IOException, UnsupportedOperationException, JAXBException;

}
