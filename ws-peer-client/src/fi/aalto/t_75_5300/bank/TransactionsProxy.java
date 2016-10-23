package fi.aalto.t_75_5300.bank;

public class TransactionsProxy implements fi.aalto.t_75_5300.bank.Transactions {
  private String _endpoint = null;
  private fi.aalto.t_75_5300.bank.Transactions transactions = null;
  
  public TransactionsProxy() {
    _initTransactionsProxy();
  }
  
  public TransactionsProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransactionsProxy();
  }
  
  private void _initTransactionsProxy() {
    try {
      transactions = (new fi.aalto.t_75_5300.bank.TransactionServiceLocator()).getTransactionsPort();
      if (transactions != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transactions)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transactions)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transactions != null)
      ((javax.xml.rpc.Stub)transactions)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fi.aalto.t_75_5300.bank.Transactions getTransactions() {
    if (transactions == null)
      _initTransactionsProxy();
    return transactions;
  }
  
  public fi.aalto.t_75_5300.bank.TransactionResult makeVisaTransaction(fi.aalto.t_75_5300.bank.VisaTransaction arg0) throws java.rmi.RemoteException, fi.aalto.t_75_5300.bank.TransactionException{
    if (transactions == null)
      _initTransactionsProxy();
    return transactions.makeVisaTransaction(arg0);
  }
  
  
}