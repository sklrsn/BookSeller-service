/**
 * TransactionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fi.aalto.t_75_5300.bank;

public interface TransactionService extends javax.xml.rpc.Service {
    public java.lang.String getTransactionsPortAddress();

    public fi.aalto.t_75_5300.bank.Transactions getTransactionsPort() throws javax.xml.rpc.ServiceException;

    public fi.aalto.t_75_5300.bank.Transactions getTransactionsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
