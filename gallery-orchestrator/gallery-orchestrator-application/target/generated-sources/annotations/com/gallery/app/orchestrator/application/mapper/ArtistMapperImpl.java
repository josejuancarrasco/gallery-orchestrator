package com.gallery.app.orchestrator.application.mapper;

import com.gallery.app.orchestrator.application.dto.ArtistDto;
import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T13:42:21+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ArtistMapperImpl implements ArtistMapper {

    @Override
    public ArtistDto toDto(ArtistDomain artistDomain) {
        if ( artistDomain == null ) {
            return null;
        }

        ArtistDto artistDto = new ArtistDto();

        if ( artistDomain.getArtistId() != null ) {
            artistDto.setArtistId( artistDomain.getArtistId() );
        }
        if ( artistDomain.getGivenNames() != null ) {
            artistDto.setGivenNames( artistDomain.getGivenNames() );
        }
        if ( artistDomain.getSurnames() != null ) {
            artistDto.setSurnames( artistDomain.getSurnames() );
        }

        return artistDto;
    }

    @Override
    public List<ArtistDto> asListArtistDto(List<ArtistDomain> artistDomainList) {
        if ( artistDomainList == null ) {
            return null;
        }

        List<ArtistDto> list = new ArrayList<ArtistDto>( artistDomainList.size() );
        for ( ArtistDomain artistDomain : artistDomainList ) {
            list.add( toDto( artistDomain ) );
        }

        return list;
    }

    @Override
    public ArtistDomain toDomain(ArtistDto artistDto) {
        if ( artistDto == null ) {
            return null;
        }

        ArtistDomain artistDomain = new ArtistDomain();

        if ( artistDto.getArtistId() != null ) {
            artistDomain.setArtistId( artistDto.getArtistId() );
        }
        if ( artistDto.getGivenNames() != null ) {
            artistDomain.setGivenNames( artistDto.getGivenNames() );
        }
        if ( artistDto.getSurnames() != null ) {
            artistDomain.setSurnames( artistDto.getSurnames() );
        }

        return artistDomain;
    }
}
