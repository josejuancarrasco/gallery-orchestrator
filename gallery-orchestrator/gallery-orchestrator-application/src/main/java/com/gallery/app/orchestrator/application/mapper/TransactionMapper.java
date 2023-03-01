package com.gallery.app.orchestrator.application.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.application.dto.TransactionDto;
import com.gallery.app.orchestrator.domain.model.TransactionDomain;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface TransactionMapper {
	
	public TransactionDomain toDomain(TransactionDto transactionDto);
	
	public TransactionDto toDto(TransactionDomain transactionDomain);
	
	public List<TransactionDto> asDtoList(List<TransactionDomain> transactionDomainList);

}
