package com.gallery.app.orchestrator.infrastructure.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gallery.app.orchestrator.domain.model.TransactionDomain;
import com.gallery.app.orchestrator.domain.port.TransactionPort;
import com.gallery.app.orchestrator.infrastructure.mapper.TransactionEntityMapper;
import com.gallery.app.orchestrator.infrastructure.rest.TransactionApiClient;

public class TransactionAdapter implements TransactionPort{
	
	@Autowired
	private TransactionApiClient transactionApiClient;
	
	@Autowired
	private TransactionEntityMapper transactionMapper;

	@Override
	public List<TransactionDomain> getAllTransaction() throws Exception {
		return this.transactionMapper.asDomainList(this.transactionApiClient.getAllTransaction());
	}

	@Override
	public TransactionDomain getTransactionById(String transactionId) throws Exception {
		return this.transactionMapper.toDomain(this.transactionApiClient.getTransactionById(transactionId));
	}

	@Override
	public void deleteTransaction(String transactionId) throws Exception {
		this.transactionApiClient.deleteTransaction(transactionId);
		
	}

	@Override
	public void saveTransaction(TransactionDomain transactionDomain) throws Exception {
		this.transactionApiClient.saveTransaction(this.transactionMapper.toEntity(transactionDomain));
	}

	@Override
	public TransactionDomain updateTransaction(String transactionId, TransactionDomain transactionDomain)
			throws Exception {	
		return this.transactionMapper.toDomain(this.transactionApiClient.updateTransaction(transactionId, this.transactionMapper.toEntity(transactionDomain)));
	}

	@Override
	public List<TransactionDomain> getTransactionByArtwork(String artworkId) throws Exception {
		return this.transactionMapper.asDomainList(this.transactionApiClient.getTransactionByArtwork(artworkId));
	}

}
