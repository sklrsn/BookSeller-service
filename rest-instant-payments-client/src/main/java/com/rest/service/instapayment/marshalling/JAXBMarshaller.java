package com.rest.service.instapayment.marshalling;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rest.service.instantpayment.request.MakePaymentRequest;

public class JAXBMarshaller {
	public static String buildMakePaymentRequest() throws JAXBException {
		MakePaymentRequest request = new MakePaymentRequest();
		request.setCardHolderName("Kalai");
		request.setCardNumber("1234432112344321");
		request.setCardSecurityCode(1234);
		request.setTransactionNumber("123BAR12");

		JAXBContext jaxbContext = JAXBContext.newInstance(MakePaymentRequest.class);

		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(request, stringWriter);
		return stringWriter.toString();
	}
}
