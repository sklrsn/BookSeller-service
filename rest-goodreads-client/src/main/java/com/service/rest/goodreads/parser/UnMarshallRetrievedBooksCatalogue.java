package com.service.rest.goodreads.parser;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;

public class UnMarshallRetrievedBooksCatalogue {

	public static GoodreadsBooksCatalogueResponse unMarshallBooksCatalogue(InputStream inputStream)
			throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(GoodreadsBooksCatalogueResponse.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		GoodreadsBooksCatalogueResponse booksCatalogueResponse = (GoodreadsBooksCatalogueResponse) unmarshaller
				.unmarshal(inputStream);
		return booksCatalogueResponse;
	}
}
