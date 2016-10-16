package com.services.ebay.offers.retrieval;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import com.service.bookstore.response.FindItemsByKeywordsResponse;

public class EbayOffersInfoRetrievalServiceImpl implements EbayOffersInfoRetrievalService {

	private static final String X_EBAY_SOA_MESSAGE_PROTOCOL = "X-EBAY-SOA-MESSAGE-PROTOCOL";
	private static final String RESPONSE_DATA_FORMAT = "RESPONSE-DATA-FORMAT";
	private static final String X_EBAY_SOA_SECURITY_APPNAME = "X-EBAY-SOA-SECURITY-APPNAME";
	private static final String X_EBAY_SOA_SERVICE_VERSION = "X-EBAY-SOA-SERVICE-VERSION";
	private static final String X_EBAY_SOA_OPERATION_NAME = "X-EBAY-SOA-OPERATION-NAME";
	private static final String SERVICE_URL = "http://svcs.sandbox.ebay.com/services/search/FindingService/v1";
	private static final String NAMESPACE = "http://www.ebay.com/marketplace/search/v1/services";
	private static final String DATA_FORMAT = "XML";
	private static final String SOAP12 = "SOAP12";
	private static final String SECURITY_APPNAME = "AaltoUni-ws-SBX-3e6eb0ea5-11d466dd";
	private static final String SERVICE_VERSION = "1.0.0";
	private static final String OPERATION_NAME = "findItemsByKeywords";

	public FindItemsByKeywordsResponse retriveOffers(String title) throws SOAPException, JAXBException {
		SOAPConnection soapConnection = createSOAPConnection();
		SOAPMessage soapResponse = soapConnection.call(buildSOAPRequest(title), SERVICE_URL);
		FindItemsByKeywordsResponse findItemsByKeywordsResponse = parseSOAPResponse(soapResponse);
		closeConection(soapConnection);
		return findItemsByKeywordsResponse;
	}

	private static SOAPMessage buildSOAPRequest(String title) throws SOAPException {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();

		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("xmlns", NAMESPACE);

		// SOAP Body
		SOAPBody soapBody = envelope.getBody();
		SOAPElement soapBodyElem = soapBody.addChildElement("findItemsByKeywordsRequest", "");
		SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("keywords", "");
		soapBodyElem1.addTextNode(title);

		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader(X_EBAY_SOA_OPERATION_NAME, OPERATION_NAME);
		headers.addHeader(X_EBAY_SOA_SERVICE_VERSION, SERVICE_VERSION);
		headers.addHeader(X_EBAY_SOA_SECURITY_APPNAME, SECURITY_APPNAME);
		headers.addHeader(RESPONSE_DATA_FORMAT, DATA_FORMAT);
		headers.addHeader(X_EBAY_SOA_MESSAGE_PROTOCOL, SOAP12);

		soapMessage.saveChanges();

		return soapMessage;
	}

	private FindItemsByKeywordsResponse parseSOAPResponse(SOAPMessage soapResponse)
			throws JAXBException, SOAPException {
		Unmarshaller unmarshaller = JAXBContext.newInstance(FindItemsByKeywordsResponse.class).createUnmarshaller();
		return (FindItemsByKeywordsResponse) unmarshaller
				.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
	}

	private void closeConection(SOAPConnection soapConnection) throws SOAPException {
		soapConnection.close();
	}

	private SOAPConnection createSOAPConnection() throws SOAPException {
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		return soapConnectionFactory.createConnection();
	}

}
