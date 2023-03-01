package com.gallery.app.orchestrator.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.gallery.app.orchestrator.domain.common.TransactionTypeEnum;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
public class TransactionDto implements Serializable{

	private static final long serialVersionUID = -7656957516181233704L;

	private String transactionId;
	
	private TransactionTypeEnum transactionType;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	private Double price;
	
	private String artworkId;
	
}
