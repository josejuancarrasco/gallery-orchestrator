package com.gallery.app.orchestrator.infrastructure.entity;

import java.time.LocalDate;

import com.gallery.app.orchestrator.domain.common.TransactionTypeEnum;

import lombok.Data;

@Data
public class TransactionEntity {

	private String transactionId;
	
	private TransactionTypeEnum transactionType;
	
	private Double price;
	
	private LocalDate date;
	
	private String artworkId;
}
