package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.TransactionDomain;

public interface TransactionService {
	
	public List<TransactionDomain> getAllTransaction() throws Exception;
	
	public TransactionDomain getTransactionById(String transactionId) throws Exception;
	
	public void deleteTransaction(String transactionId) throws Exception;
	
	public void saveTransaction(TransactionDomain transactionDomain) throws Exception;

	public TransactionDomain updateTransaction(String transactionId, TransactionDomain transactionDomain) throws Exception;
	
	public List<TransactionDomain> getTransactionByArtwork(String artworkId) throws Exception;
}
