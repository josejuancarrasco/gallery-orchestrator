package com.gallery.app.orchestrator.application.mapper;

import java.util.List;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

import com.gallery.app.orchestrator.application.dto.ArtistDto;
import com.gallery.app.orchestrator.domain.model.ArtistDomain;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface ArtistMapper {
	
	public ArtistDto toDto(ArtistDomain artistDomain);

	public List<ArtistDto> asListArtistDto(List<ArtistDomain> artistDomainList);
	
	public ArtistDomain toDomain(ArtistDto artistDto);
	
}
