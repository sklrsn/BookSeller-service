package com.services.ebay.offers.retrieval;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import com.service.bookstore.response.FindItemsByCategoryResponse;
import com.service.bookstore.response.FindItemsByKeywordsResponse;

public interface EbayOffersInfoRetrievalService {

	FindItemsByKeywordsResponse retriveOffersByKeywords(String title) throws SOAPException, JAXBException;

	FindItemsByCategoryResponse retriveOffersByCategory(String keyword) throws SOAPException, JAXBException;

}
