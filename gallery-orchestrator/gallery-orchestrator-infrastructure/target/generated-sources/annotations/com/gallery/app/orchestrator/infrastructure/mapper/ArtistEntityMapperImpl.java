package com.gallery.app.orchestrator.infrastructure.mapper;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;
import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity.ArtistEntityBuilder;
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

        ArtistEntityBuilder artistEntity = ArtistEntity.builder();

        if ( artistDomain.getArtistId() != null ) {
            artistEntity.artistId( artistDomain.getArtistId() );
        }
        if ( artistDomain.getGivenNames() != null ) {
            artistEntity.givenNames( artistDomain.getGivenNames() );
        }
        if ( artistDomain.getSurnames() != null ) {
            artistEntity.surnames( artistDomain.getSurnames() );
        }

        return artistEntity.build();
    }
}
