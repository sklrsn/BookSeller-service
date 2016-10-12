package com.service.rest.goodreads.parser;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;
import com.service.rest.goodreads.response.GoodreadsRetrieveISBNResponse;

public class UnMarshallRetrievedBooksCatalogue {

	public static GoodreadsBooksCatalogueResponse unMarshallBooksCatalogue(InputStream inputStream)
			throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(GoodreadsBooksCatalogueResponse.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (GoodreadsBooksCatalogueResponse) unmarshaller.unmarshal(inputStream);
	}

	public static GoodreadsRetrieveISBNResponse unMarshallISBNstream(InputStream inputStream) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(GoodreadsRetrieveISBNResponse.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (GoodreadsRetrieveISBNResponse) unmarshaller.unmarshal(inputStream);
	}
}
