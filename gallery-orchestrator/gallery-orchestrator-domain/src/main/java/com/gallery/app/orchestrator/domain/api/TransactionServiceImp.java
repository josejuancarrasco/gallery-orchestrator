package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.TransactionDomain;
import com.gallery.app.orchestrator.domain.port.TransactionPort;

public class TransactionServiceImp implements TransactionService{
	

	private final TransactionPort transactionPort;
	
	public TransactionServiceImp(TransactionPort transactionPort) {
		this.transactionPort = transactionPort;
	}

	@Override
	public List<TransactionDomain> getAllTransaction() throws Exception {
		return this.transactionPort.getAllTransaction();
	}

	@Override
	public TransactionDomain getTransactionById(String artworkId) throws Exception {
		return this.transactionPort.getTransactionById(artworkId);
	}

	@Override
	public void deleteTransaction(String transactionId) throws Exception {
		this.transactionPort.deleteTransaction(transactionId);
	}

	@Override
	public void saveTransaction(TransactionDomain transactionDomain) throws Exception {
		this.transactionPort.saveTransaction(transactionDomain);
	}

	@Override
	public TransactionDomain updateTransaction(String transactionId, TransactionDomain transactionDomain)
			throws Exception {
		return this.transactionPort.updateTransaction(transactionId, transactionDomain);
	}

	@Override
	public List<TransactionDomain> getTransactionByArtwork(String artworkId) throws Exception {
		return this.transactionPort.getTransactionByArtwork(artworkId);
	}

}
