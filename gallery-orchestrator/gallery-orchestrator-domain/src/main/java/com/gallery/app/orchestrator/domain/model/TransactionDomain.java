package com.gallery.app.orchestrator.domain.model;

import java.time.LocalDate;

import com.gallery.app.orchestrator.domain.common.TransactionTypeEnum;

import lombok.Data;

@Data
public class TransactionDomain {

	private String transactionId;
	
	private TransactionTypeEnum transactionType;
	
	private LocalDate date;
	
	private Double price;
	
	private String artworkId;
}
