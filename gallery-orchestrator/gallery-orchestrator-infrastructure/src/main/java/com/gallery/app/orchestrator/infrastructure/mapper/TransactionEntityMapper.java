package com.gallery.app.orchestrator.infrastructure.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.domain.model.TransactionDomain;
import com.gallery.app.orchestrator.infrastructure.entity.TransactionEntity;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface TransactionEntityMapper {

	public TransactionDomain toDomain(TransactionEntity transactionEntity);
	
	public TransactionEntity toEntity(TransactionDomain transactionDomain);
	
	public List<TransactionDomain> asDomainList(List<TransactionEntity> transactionEntityList);
}
