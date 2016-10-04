package com.ws.service.instantpayment;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ws.service.instantpayment.request.MakePaymentRequest;
import com.ws.service.instantpayment.response.MakePaymentResponse;

@WebService(serviceName = "InstantPay")
public interface InstantPaymentService {

	@WebMethod
	Boolean isRunning();

	@WebMethod
	MakePaymentResponse processPayment(MakePaymentRequest makePaymentRequest);
}
