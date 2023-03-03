package com.gallery.app.orchestrator.infrastructure.mapper;

import com.gallery.app.orchestrator.domain.common.ArtworkStatusEnum;
import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-02T13:45:56+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ArtworkEntityMapperImpl implements ArtworkEntityMapper {

    @Override
    public ArtworkDomain toDomain(ArtworkEntity artworkEntity) {
        if ( artworkEntity == null ) {
            return null;
        }

        ArtworkDomain artworkDomain = new ArtworkDomain();

        if ( artworkEntity.getArtworkId() != null ) {
            artworkDomain.setArtworkId( artworkEntity.getArtworkId() );
        }
        if ( artworkEntity.getTitle() != null ) {
            artworkDomain.setTitle( artworkEntity.getTitle() );
        }
        if ( artworkEntity.getDescription() != null ) {
            artworkDomain.setDescription( artworkEntity.getDescription() );
        }
        if ( artworkEntity.getSigned() != null ) {
            artworkDomain.setSigned( artworkEntity.getSigned() );
        }
        if ( artworkEntity.getNumeration() != null ) {
            artworkDomain.setNumeration( artworkEntity.getNumeration() );
        }
        if ( artworkEntity.getEditor() != null ) {
            artworkDomain.setEditor( artworkEntity.getEditor() );
        }
        if ( artworkEntity.getPhoto() != null ) {
            artworkDomain.setPhoto( artworkEntity.getPhoto() );
        }
        if ( artworkEntity.getArtworkStatus() != null ) {
            artworkDomain.setArtworkStatus( artworkEntity.getArtworkStatus() );
        }
        if ( artworkEntity.getArtistId() != null ) {
            artworkDomain.setArtistId( artworkEntity.getArtistId() );
        }
        if ( artworkEntity.getClientId() != null ) {
            artworkDomain.setClientId( artworkEntity.getClientId() );
        }

        return artworkDomain;
    }

    @Override
    public List<ArtworkDomain> asDomainList(List<ArtworkEntity> artworkEntityList) {
        if ( artworkEntityList == null ) {
            return null;
        }

        List<ArtworkDomain> list = new ArrayList<ArtworkDomain>( artworkEntityList.size() );
        for ( ArtworkEntity artworkEntity : artworkEntityList ) {
            list.add( toDomain( artworkEntity ) );
        }

        return list;
    }

    @Override
    public ArtworkEntity toEntity(ArtworkDomain artworkDomain) {
        if ( artworkDomain == null ) {
            return null;
        }

        String artworkId = null;
        String title = null;
        String description = null;
        Boolean signed = null;
        String numeration = null;
        String editor = null;
        String photo = null;
        ArtworkStatusEnum artworkStatus = null;
        String artistId = null;
        String clientId = null;

        if ( artworkDomain.getArtworkId() != null ) {
            artworkId = artworkDomain.getArtworkId();
        }
        if ( artworkDomain.getTitle() != null ) {
            title = artworkDomain.getTitle();
        }
        if ( artworkDomain.getDescription() != null ) {
            description = artworkDomain.getDescription();
        }
        if ( artworkDomain.getSigned() != null ) {
            signed = artworkDomain.getSigned();
        }
        if ( artworkDomain.getNumeration() != null ) {
            numeration = artworkDomain.getNumeration();
        }
        if ( artworkDomain.getEditor() != null ) {
            editor = artworkDomain.getEditor();
        }
        if ( artworkDomain.getPhoto() != null ) {
            photo = artworkDomain.getPhoto();
        }
        if ( artworkDomain.getArtworkStatus() != null ) {
            artworkStatus = artworkDomain.getArtworkStatus();
        }
        if ( artworkDomain.getArtistId() != null ) {
            artistId = artworkDomain.getArtistId();
        }
        if ( artworkDomain.getClientId() != null ) {
            clientId = artworkDomain.getClientId();
        }

        ArtworkEntity artworkEntity = new ArtworkEntity( artworkId, title, description, signed, numeration, editor, photo, artworkStatus, artistId, clientId );

        return artworkEntity;
    }
}
