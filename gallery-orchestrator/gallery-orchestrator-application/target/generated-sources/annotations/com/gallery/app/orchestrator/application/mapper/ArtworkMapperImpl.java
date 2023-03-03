package com.gallery.app.orchestrator.application.mapper;

import com.gallery.app.orchestrator.application.dto.ArtworkDto;
import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-02T13:45:53+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ArtworkMapperImpl implements ArtworkMapper {

    @Override
    public ArtworkDto toDto(ArtworkDomain artworkDomain) {
        if ( artworkDomain == null ) {
            return null;
        }

        ArtworkDto artworkDto = new ArtworkDto();

        if ( artworkDomain.getArtworkId() != null ) {
            artworkDto.setArtworkId( artworkDomain.getArtworkId() );
        }
        if ( artworkDomain.getTitle() != null ) {
            artworkDto.setTitle( artworkDomain.getTitle() );
        }
        if ( artworkDomain.getDescription() != null ) {
            artworkDto.setDescription( artworkDomain.getDescription() );
        }
        if ( artworkDomain.getSigned() != null ) {
            artworkDto.setSigned( artworkDomain.getSigned() );
        }
        if ( artworkDomain.getNumeration() != null ) {
            artworkDto.setNumeration( artworkDomain.getNumeration() );
        }
        if ( artworkDomain.getEditor() != null ) {
            artworkDto.setEditor( artworkDomain.getEditor() );
        }
        if ( artworkDomain.getPhoto() != null ) {
            artworkDto.setPhoto( artworkDomain.getPhoto() );
        }
        if ( artworkDomain.getArtworkStatus() != null ) {
            artworkDto.setArtworkStatus( artworkDomain.getArtworkStatus() );
        }
        if ( artworkDomain.getArtistId() != null ) {
            artworkDto.setArtistId( artworkDomain.getArtistId() );
        }
        if ( artworkDomain.getClientId() != null ) {
            artworkDto.setClientId( artworkDomain.getClientId() );
        }

        return artworkDto;
    }

    @Override
    public ArtworkDomain toDomain(ArtworkDto artworkDto) {
        if ( artworkDto == null ) {
            return null;
        }

        ArtworkDomain artworkDomain = new ArtworkDomain();

        if ( artworkDto.getArtworkId() != null ) {
            artworkDomain.setArtworkId( artworkDto.getArtworkId() );
        }
        if ( artworkDto.getTitle() != null ) {
            artworkDomain.setTitle( artworkDto.getTitle() );
        }
        if ( artworkDto.getDescription() != null ) {
            artworkDomain.setDescription( artworkDto.getDescription() );
        }
        if ( artworkDto.getSigned() != null ) {
            artworkDomain.setSigned( artworkDto.getSigned() );
        }
        if ( artworkDto.getNumeration() != null ) {
            artworkDomain.setNumeration( artworkDto.getNumeration() );
        }
        if ( artworkDto.getEditor() != null ) {
            artworkDomain.setEditor( artworkDto.getEditor() );
        }
        if ( artworkDto.getPhoto() != null ) {
            artworkDomain.setPhoto( artworkDto.getPhoto() );
        }
        if ( artworkDto.getArtworkStatus() != null ) {
            artworkDomain.setArtworkStatus( artworkDto.getArtworkStatus() );
        }
        if ( artworkDto.getArtistId() != null ) {
            artworkDomain.setArtistId( artworkDto.getArtistId() );
        }
        if ( artworkDto.getClientId() != null ) {
            artworkDomain.setClientId( artworkDto.getClientId() );
        }

        return artworkDomain;
    }

    @Override
    public List<ArtworkDto> asListDto(List<ArtworkDomain> artworkDomainList) {
        if ( artworkDomainList == null ) {
            return null;
        }

        List<ArtworkDto> list = new ArrayList<ArtworkDto>( artworkDomainList.size() );
        for ( ArtworkDomain artworkDomain : artworkDomainList ) {
            list.add( toDto( artworkDomain ) );
        }

        return list;
    }
}
