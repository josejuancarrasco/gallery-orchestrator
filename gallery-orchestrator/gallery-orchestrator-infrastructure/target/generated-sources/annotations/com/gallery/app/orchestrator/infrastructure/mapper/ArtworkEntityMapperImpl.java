package com.gallery.app.orchestrator.infrastructure.mapper;

import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity;
import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity.ArtworkEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T13:42:23+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class ArtworkEntityMapperImpl implements ArtworkEntityMapper {

    @Override
    public ArtworkDomain toDomain(ArtworkEntity artworkEntity) {
        if ( artworkEntity == null ) {
            return null;
        }

        ArtworkDomain artworkDomain = new ArtworkDomain();

        if ( artworkEntity.getArtistId() != null ) {
            artworkDomain.setArtistId( artworkEntity.getArtistId() );
        }
        if ( artworkEntity.getArtworkId() != null ) {
            artworkDomain.setArtworkId( artworkEntity.getArtworkId() );
        }
        if ( artworkEntity.getArtworkStatus() != null ) {
            artworkDomain.setArtworkStatus( artworkEntity.getArtworkStatus() );
        }
        if ( artworkEntity.getClientId() != null ) {
            artworkDomain.setClientId( artworkEntity.getClientId() );
        }
        if ( artworkEntity.getDescription() != null ) {
            artworkDomain.setDescription( artworkEntity.getDescription() );
        }
        if ( artworkEntity.getEditor() != null ) {
            artworkDomain.setEditor( artworkEntity.getEditor() );
        }
        if ( artworkEntity.getNumeration() != null ) {
            artworkDomain.setNumeration( artworkEntity.getNumeration() );
        }
        if ( artworkEntity.getPhoto() != null ) {
            artworkDomain.setPhoto( artworkEntity.getPhoto() );
        }
        if ( artworkEntity.getSigned() != null ) {
            artworkDomain.setSigned( artworkEntity.getSigned() );
        }
        if ( artworkEntity.getTitle() != null ) {
            artworkDomain.setTitle( artworkEntity.getTitle() );
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

        ArtworkEntityBuilder artworkEntity = ArtworkEntity.builder();

        if ( artworkDomain.getArtistId() != null ) {
            artworkEntity.artistId( artworkDomain.getArtistId() );
        }
        if ( artworkDomain.getArtworkId() != null ) {
            artworkEntity.artworkId( artworkDomain.getArtworkId() );
        }
        if ( artworkDomain.getArtworkStatus() != null ) {
            artworkEntity.artworkStatus( artworkDomain.getArtworkStatus() );
        }
        if ( artworkDomain.getClientId() != null ) {
            artworkEntity.clientId( artworkDomain.getClientId() );
        }
        if ( artworkDomain.getDescription() != null ) {
            artworkEntity.description( artworkDomain.getDescription() );
        }
        if ( artworkDomain.getEditor() != null ) {
            artworkEntity.editor( artworkDomain.getEditor() );
        }
        if ( artworkDomain.getNumeration() != null ) {
            artworkEntity.numeration( artworkDomain.getNumeration() );
        }
        if ( artworkDomain.getPhoto() != null ) {
            artworkEntity.photo( artworkDomain.getPhoto() );
        }
        if ( artworkDomain.getSigned() != null ) {
            artworkEntity.signed( artworkDomain.getSigned() );
        }
        if ( artworkDomain.getTitle() != null ) {
            artworkEntity.title( artworkDomain.getTitle() );
        }

        return artworkEntity.build();
    }
}
