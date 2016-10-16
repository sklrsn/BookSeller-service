package com.services.ebay.offers.retrieval;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import com.service.bookstore.response.FindItemsByKeywordsResponse;

public interface EbayOffersInfoRetrievalService {

	FindItemsByKeywordsResponse retriveOffers(String title) throws SOAPException, JAXBException;

}
