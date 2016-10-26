package com.services.ebay.offers.retrieval;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import com.service.bookstore.response.FindItemsByCategoryResponse;
import com.service.bookstore.response.FindItemsByKeywordsResponse;
import com.service.bookstore.response.FindItemsByProductResponse;

public interface EbayOffersInfoRetrievalService {

	FindItemsByKeywordsResponse retriveOffersByKeywords(String title) throws SOAPException, JAXBException;

	FindItemsByCategoryResponse retriveOffersByISBN(String keyword) throws SOAPException, JAXBException;

	FindItemsByProductResponse retriveOffersByProductId(String productId) throws SOAPException, JAXBException;

}
