package com.ws.service.instantpayment;

public class InstantPaymentServiceImplProxy implements com.ws.service.instantpayment.InstantPaymentServiceImpl {
  private String _endpoint = null;
  private com.ws.service.instantpayment.InstantPaymentServiceImpl instantPaymentServiceImpl = null;
  
  public InstantPaymentServiceImplProxy() {
    _initInstantPaymentServiceImplProxy();
  }
  
  public InstantPaymentServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initInstantPaymentServiceImplProxy();
  }
  
  private void _initInstantPaymentServiceImplProxy() {
    try {
      instantPaymentServiceImpl = (new com.ws.service.instantpayment.InstantPaymentServiceImplServiceLocator()).getInstantPaymentServiceImpl();
      if (instantPaymentServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)instantPaymentServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)instantPaymentServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (instantPaymentServiceImpl != null)
      ((javax.xml.rpc.Stub)instantPaymentServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.service.instantpayment.InstantPaymentServiceImpl getInstantPaymentServiceImpl() {
    if (instantPaymentServiceImpl == null)
      _initInstantPaymentServiceImplProxy();
    return instantPaymentServiceImpl;
  }
  
  public boolean isRunning() throws java.rmi.RemoteException{
    if (instantPaymentServiceImpl == null)
      _initInstantPaymentServiceImplProxy();
    return instantPaymentServiceImpl.isRunning();
  }
  
  public com.ws.service.instantpayment.response.MakePaymentResponse processPayment(com.ws.service.instantpayment.request.MakePaymentRequest makePaymentRequest) throws java.rmi.RemoteException{
    if (instantPaymentServiceImpl == null)
      _initInstantPaymentServiceImplProxy();
    return instantPaymentServiceImpl.processPayment(makePaymentRequest);
  }
  
  
}