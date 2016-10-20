package com.rest.service.instantpayment;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rest.service.instantpayment.request.MakePaymentRequest;
import com.rest.service.instantpayment.response.MakePaymentResponse;

@Path("/InstantPaymentService")
public class InstantPaymentService {

	@GET
	@Path("/IsRunning")
	public Response isRunning() {
		return Response.status(Status.OK).entity("Service is up and running").build();
	}

	@POST
	@Path("/MakePayment")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response processPayment(MakePaymentRequest makePaymentRequest) {
		MakePaymentResponse makePaymentResponse = new MakePaymentResponse();
		makePaymentResponse.setIsProcessed(Boolean.TRUE);
		return Response.status(Status.OK).entity(makePaymentResponse).build();
	}

	@GET
	@Path("/ProcessPayement")
	public Response processPayement() {
		return Response.status(Status.OK).entity("Processed!!!!").build();
	}
}
