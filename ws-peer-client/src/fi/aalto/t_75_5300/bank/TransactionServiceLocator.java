/**
 * TransactionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fi.aalto.t_75_5300.bank;

public class TransactionServiceLocator extends org.apache.axis.client.Service implements fi.aalto.t_75_5300.bank.TransactionService {

    public TransactionServiceLocator() {
    }


    public TransactionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TransactionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TransactionsPort
    private java.lang.String TransactionsPort_address = "http://demo.seco.tkk.fi/ws/6/t755300bank/services/v1/transactions";

    public java.lang.String getTransactionsPortAddress() {
        return TransactionsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TransactionsPortWSDDServiceName = "TransactionsPort";

    public java.lang.String getTransactionsPortWSDDServiceName() {
        return TransactionsPortWSDDServiceName;
    }

    public void setTransactionsPortWSDDServiceName(java.lang.String name) {
        TransactionsPortWSDDServiceName = name;
    }

    public fi.aalto.t_75_5300.bank.Transactions getTransactionsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TransactionsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTransactionsPort(endpoint);
    }

    public fi.aalto.t_75_5300.bank.Transactions getTransactionsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fi.aalto.t_75_5300.bank.TransactionServiceSoapBindingStub _stub = new fi.aalto.t_75_5300.bank.TransactionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTransactionsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTransactionsPortEndpointAddress(java.lang.String address) {
        TransactionsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fi.aalto.t_75_5300.bank.Transactions.class.isAssignableFrom(serviceEndpointInterface)) {
                fi.aalto.t_75_5300.bank.TransactionServiceSoapBindingStub _stub = new fi.aalto.t_75_5300.bank.TransactionServiceSoapBindingStub(new java.net.URL(TransactionsPort_address), this);
                _stub.setPortName(getTransactionsPortWSDDServiceName());
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
        if ("TransactionsPort".equals(inputPortName)) {
            return getTransactionsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://aalto.fi/t-75.5300/bank", "TransactionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://aalto.fi/t-75.5300/bank", "TransactionsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TransactionsPort".equals(portName)) {
            setTransactionsPortEndpointAddress(address);
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
