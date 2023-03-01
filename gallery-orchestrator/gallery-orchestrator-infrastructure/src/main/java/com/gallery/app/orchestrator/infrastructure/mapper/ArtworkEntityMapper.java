package com.gallery.app.orchestrator.infrastructure.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface ArtworkEntityMapper {

	public ArtworkDomain toDomain(ArtworkEntity artworkEntity);
	
	public List<ArtworkDomain> asDomainList(List<ArtworkEntity> artworkEntityList);
	
	public ArtworkEntity toEntity(ArtworkDomain artworkDomain);
}
