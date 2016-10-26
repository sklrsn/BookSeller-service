package fi.aalto.bank.service;

import fi.aalto.t_75_5300.bank.TransactionServiceLocator;
import fi.aalto.t_75_5300.bank.VisaTransaction;

public class MakeVisaTransaction {
	public Boolean processVisaTransaction(VisaTransaction visaTransaction) {
		TransactionServiceLocator transactionServiceLocator = new TransactionServiceLocator();
		try {
			transactionServiceLocator.getTransactionsPort().makeVisaTransaction(visaTransaction);
			return Boolean.TRUE;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}

}
