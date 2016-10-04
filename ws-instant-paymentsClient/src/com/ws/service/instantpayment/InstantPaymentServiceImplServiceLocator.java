/**
 * InstantPaymentServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service.instantpayment;

public class InstantPaymentServiceImplServiceLocator extends org.apache.axis.client.Service implements com.ws.service.instantpayment.InstantPaymentServiceImplService {

    public InstantPaymentServiceImplServiceLocator() {
    }


    public InstantPaymentServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InstantPaymentServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InstantPaymentServiceImpl
    private java.lang.String InstantPaymentServiceImpl_address = "http://localhost:8080/ws-instant-payments/services/InstantPaymentServiceImpl";

    public java.lang.String getInstantPaymentServiceImplAddress() {
        return InstantPaymentServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InstantPaymentServiceImplWSDDServiceName = "InstantPaymentServiceImpl";

    public java.lang.String getInstantPaymentServiceImplWSDDServiceName() {
        return InstantPaymentServiceImplWSDDServiceName;
    }

    public void setInstantPaymentServiceImplWSDDServiceName(java.lang.String name) {
        InstantPaymentServiceImplWSDDServiceName = name;
    }

    public com.ws.service.instantpayment.InstantPaymentServiceImpl getInstantPaymentServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InstantPaymentServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInstantPaymentServiceImpl(endpoint);
    }

    public com.ws.service.instantpayment.InstantPaymentServiceImpl getInstantPaymentServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.service.instantpayment.InstantPaymentServiceImplSoapBindingStub _stub = new com.ws.service.instantpayment.InstantPaymentServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getInstantPaymentServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInstantPaymentServiceImplEndpointAddress(java.lang.String address) {
        InstantPaymentServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.service.instantpayment.InstantPaymentServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.service.instantpayment.InstantPaymentServiceImplSoapBindingStub _stub = new com.ws.service.instantpayment.InstantPaymentServiceImplSoapBindingStub(new java.net.URL(InstantPaymentServiceImpl_address), this);
                _stub.setPortName(getInstantPaymentServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InstantPaymentServiceImpl".equals(inputPortName)) {
            return getInstantPaymentServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://instantpayment.service.ws.com", "InstantPaymentServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://instantpayment.service.ws.com", "InstantPaymentServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InstantPaymentServiceImpl".equals(portName)) {
            setInstantPaymentServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
