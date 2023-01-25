package com.gallery.app.orchestrator.infrastructure.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface ArtistEntityMapper {

	public ArtistDomain toDomain(ArtistEntity artistEntity);
	
	public List<ArtistDomain> asDomainList(List<ArtistEntity> artistEntityList);
	
	public ArtistEntity toEntity(ArtistDomain artistDomain);
}
