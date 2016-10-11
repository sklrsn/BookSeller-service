package com.service.rest.goodreads.retrieve;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;

public interface GoodreadsInfoRetrievalService {

	void retrievebooks(String keyword) throws ClientProtocolException, IOException, JAXBException;

}
