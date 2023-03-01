package com.gallery.app.orchestrator.infrastructure.rest;

import java.util.List;

import com.gallery.app.orchestrator.infrastructure.entity.TransactionEntity;

public interface TransactionApiClient {

	public List<TransactionEntity> getAllTransaction() throws Exception;
	
	public TransactionEntity getTransactionById(String transactionId) throws Exception;
	
	public void deleteTransaction(String transactionId) throws Exception;
	
	public void saveTransaction(TransactionEntity TransactionEntity) throws Exception;
	
	public TransactionEntity updateTransaction(String transactionId, TransactionEntity TransactionEntity) throws Exception;
	
	public List<TransactionEntity> getTransactionByArtwork(String artworkId) throws Exception;

}
