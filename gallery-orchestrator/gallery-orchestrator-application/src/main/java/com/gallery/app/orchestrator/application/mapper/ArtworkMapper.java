package com.gallery.app.orchestrator.application.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.application.dto.ArtworkDto;
import com.gallery.app.orchestrator.domain.model.ArtworkDomain;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface ArtworkMapper {

	public ArtworkDto toDto(ArtworkDomain artworkDomain);
	
	public ArtworkDomain toDomain(ArtworkDto artworkDto);
	
	public List<ArtworkDto> asListDto(List<ArtworkDomain> artworkDomainList);
}
