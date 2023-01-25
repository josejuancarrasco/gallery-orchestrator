package com.gallery.app.orchestrator.infrastructure.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import com.gallery.app.orchestrator.domain.port.ArtistPort;
import com.gallery.app.orchestrator.infrastructure.mapper.ArtistEntityMapper;
import com.gallery.app.orchestrator.infrastructure.rest.ArtistApiClient;

public class ArtistAdapter implements ArtistPort{
	
	@Autowired 
	private ArtistApiClient artistApiClient;

	@Autowired
	private ArtistEntityMapper artistMapper;
	
	@Override
	public List<ArtistDomain> listArtist() throws Exception {
		return this.artistMapper.asDomainList(this.artistApiClient.getAllArtist());
	}

	@Override
	public ArtistDomain getArtistById(String artistId) throws Exception {
		return this.artistMapper.toDomain(this.artistApiClient.getArtistById(artistId));
	}

	@Override
	public void deleteArtist(String artistId) throws Exception {
		this.artistApiClient.deleteArtist(artistId);
	}

	@Override
	public void saveArtist(ArtistDomain artist) throws Exception {
		this.artistApiClient.saveArtist(this.artistMapper.toEntity(artist));	
	}

	@Override
	public ArtistDomain updateArtist(String artistId, ArtistDomain artist) throws Exception {
		return this.artistMapper.toDomain(this.artistApiClient.updateArtist(artistId, this.artistMapper.toEntity(artist)));
	}

}
