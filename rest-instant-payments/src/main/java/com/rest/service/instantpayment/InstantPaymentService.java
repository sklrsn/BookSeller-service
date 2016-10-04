package com.rest.service.instantpayment;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.rest.service.instantpayment.response.MakePaymentResponse;

@Path("/InstantPaymentService")
public class InstantPaymentService {

	@Path("/IsRunning")
	@GET
	public Response isRunning() {
		return Response.status(Status.OK).entity("Service is up and running").build();
	}

	@Path("/MakePayment")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response processPayment() {
		MakePaymentResponse makePaymentResponse = new MakePaymentResponse();
		makePaymentResponse.setIsProcessed(Boolean.TRUE);
		return Response.status(Status.OK).entity(makePaymentResponse).build();

	}
}
