package com.gallery.app.orchestrator.application.mapper;

import com.gallery.app.orchestrator.application.dto.ArtworkDto;
import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
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
public class ArtworkMapperImpl implements ArtworkMapper {

    @Override
    public ArtworkDto toDto(ArtworkDomain artworkDomain) {
        if ( artworkDomain == null ) {
            return null;
        }

        ArtworkDto artworkDto = new ArtworkDto();

        if ( artworkDomain.getArtistId() != null ) {
            artworkDto.setArtistId( artworkDomain.getArtistId() );
        }
        if ( artworkDomain.getArtworkId() != null ) {
            artworkDto.setArtworkId( artworkDomain.getArtworkId() );
        }
        if ( artworkDomain.getArtworkStatus() != null ) {
            artworkDto.setArtworkStatus( artworkDomain.getArtworkStatus() );
        }
        if ( artworkDomain.getClientId() != null ) {
            artworkDto.setClientId( artworkDomain.getClientId() );
        }
        if ( artworkDomain.getDescription() != null ) {
            artworkDto.setDescription( artworkDomain.getDescription() );
        }
        if ( artworkDomain.getEditor() != null ) {
            artworkDto.setEditor( artworkDomain.getEditor() );
        }
        if ( artworkDomain.getNumeration() != null ) {
            artworkDto.setNumeration( artworkDomain.getNumeration() );
        }
        if ( artworkDomain.getPhoto() != null ) {
            artworkDto.setPhoto( artworkDomain.getPhoto() );
        }
        if ( artworkDomain.getSigned() != null ) {
            artworkDto.setSigned( artworkDomain.getSigned() );
        }
        if ( artworkDomain.getTitle() != null ) {
            artworkDto.setTitle( artworkDomain.getTitle() );
        }

        return artworkDto;
    }

    @Override
    public ArtworkDomain toDomain(ArtworkDto artworkDto) {
        if ( artworkDto == null ) {
            return null;
        }

        ArtworkDomain artworkDomain = new ArtworkDomain();

        if ( artworkDto.getArtistId() != null ) {
            artworkDomain.setArtistId( artworkDto.getArtistId() );
        }
        if ( artworkDto.getArtworkId() != null ) {
            artworkDomain.setArtworkId( artworkDto.getArtworkId() );
        }
        if ( artworkDto.getArtworkStatus() != null ) {
            artworkDomain.setArtworkStatus( artworkDto.getArtworkStatus() );
        }
        if ( artworkDto.getClientId() != null ) {
            artworkDomain.setClientId( artworkDto.getClientId() );
        }
        if ( artworkDto.getDescription() != null ) {
            artworkDomain.setDescription( artworkDto.getDescription() );
        }
        if ( artworkDto.getEditor() != null ) {
            artworkDomain.setEditor( artworkDto.getEditor() );
        }
        if ( artworkDto.getNumeration() != null ) {
            artworkDomain.setNumeration( artworkDto.getNumeration() );
        }
        if ( artworkDto.getPhoto() != null ) {
            artworkDomain.setPhoto( artworkDto.getPhoto() );
        }
        if ( artworkDto.getSigned() != null ) {
            artworkDomain.setSigned( artworkDto.getSigned() );
        }
        if ( artworkDto.getTitle() != null ) {
            artworkDomain.setTitle( artworkDto.getTitle() );
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
