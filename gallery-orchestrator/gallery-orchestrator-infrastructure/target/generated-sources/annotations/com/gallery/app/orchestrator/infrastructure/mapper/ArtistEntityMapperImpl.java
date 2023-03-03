package com.gallery.app.orchestrator.infrastructure.mapper;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;
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
public class ArtistEntityMapperImpl implements ArtistEntityMapper {

    @Override
    public ArtistDomain toDomain(ArtistEntity artistEntity) {
        if ( artistEntity == null ) {
            return null;
        }

        ArtistDomain artistDomain = new ArtistDomain();

        if ( artistEntity.getArtistId() != null ) {
            artistDomain.setArtistId( artistEntity.getArtistId() );
        }
        if ( artistEntity.getGivenNames() != null ) {
            artistDomain.setGivenNames( artistEntity.getGivenNames() );
        }
        if ( artistEntity.getSurnames() != null ) {
            artistDomain.setSurnames( artistEntity.getSurnames() );
        }

        return artistDomain;
    }

    @Override
    public List<ArtistDomain> asDomainList(List<ArtistEntity> artistEntityList) {
        if ( artistEntityList == null ) {
            return null;
        }

        List<ArtistDomain> list = new ArrayList<ArtistDomain>( artistEntityList.size() );
        for ( ArtistEntity artistEntity : artistEntityList ) {
            list.add( toDomain( artistEntity ) );
        }

        return list;
    }

    @Override
    public ArtistEntity toEntity(ArtistDomain artistDomain) {
        if ( artistDomain == null ) {
            return null;
        }

        String artistId = null;
        String givenNames = null;
        String surnames = null;

        if ( artistDomain.getArtistId() != null ) {
            artistId = artistDomain.getArtistId();
        }
        if ( artistDomain.getGivenNames() != null ) {
            givenNames = artistDomain.getGivenNames();
        }
        if ( artistDomain.getSurnames() != null ) {
            surnames = artistDomain.getSurnames();
        }

        ArtistEntity artistEntity = new ArtistEntity( artistId, givenNames, surnames );

        return artistEntity;
    }
}
