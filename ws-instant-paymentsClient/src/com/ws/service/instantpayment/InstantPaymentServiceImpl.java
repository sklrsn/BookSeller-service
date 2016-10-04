/**
 * InstantPaymentServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service.instantpayment;

public interface InstantPaymentServiceImpl extends java.rmi.Remote {
    public boolean isRunning() throws java.rmi.RemoteException;
    public com.ws.service.instantpayment.response.MakePaymentResponse processPayment(com.ws.service.instantpayment.request.MakePaymentRequest makePaymentRequest) throws java.rmi.RemoteException;
}
