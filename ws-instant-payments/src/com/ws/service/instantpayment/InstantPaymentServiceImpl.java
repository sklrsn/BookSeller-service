package com.ws.service.instantpayment;

import javax.jws.WebService;

import com.ws.service.instantpayment.request.MakePaymentRequest;
import com.ws.service.instantpayment.response.MakePaymentResponse;

@WebService(endpointInterface = "com.ws.service.instantpayment.InstantPaymentService")
public class InstantPaymentServiceImpl implements InstantPaymentService {

	@Override
	public Boolean isRunning() {
		return Boolean.TRUE;
	}

	@Override
	public MakePaymentResponse processPayment(MakePaymentRequest makePaymentRequest) {
		MakePaymentResponse makePaymentResponse = new MakePaymentResponse();
		makePaymentResponse.setIsProcessed(Boolean.TRUE);
		return makePaymentResponse;
	}

}
