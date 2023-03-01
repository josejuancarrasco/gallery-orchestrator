package com.gallery.app.orchestrator.infrastructure.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import com.gallery.app.orchestrator.domain.port.ArtworkPort;
import com.gallery.app.orchestrator.infrastructure.mapper.ArtworkEntityMapper;
import com.gallery.app.orchestrator.infrastructure.rest.ArtworkApiClient;

public class ArtworkAdapter implements ArtworkPort{
	
	@Autowired
	private ArtworkApiClient artworkApiClient;
	
	@Autowired
	private ArtworkEntityMapper artworkMapper;

	@Override
	public List<ArtworkDomain> getAllArtworks() throws Exception {
		return this.artworkMapper.asDomainList(this.artworkApiClient.getAllArtworks());
	}

	@Override
	public ArtworkDomain getArtworkById(String artworkId) throws Exception {
		return this.artworkMapper.toDomain(this.artworkApiClient.getArtworkById(artworkId));
	}

	@Override
	public void deleteArtwork(String artworkId) throws Exception {
		this.artworkApiClient.deleteArtwork(artworkId);
		
	}

	@Override
	public String saveArtwork(ArtworkDomain artworkDomain) throws Exception {
		return this.artworkApiClient.saveArtwork(this.artworkMapper.toEntity(artworkDomain));
		
	}

	@Override
	public ArtworkDomain updateArtwork(String artworkId, ArtworkDomain artworkDomain) throws Exception {
		return this.artworkMapper.toDomain(this.artworkApiClient.updateArtwork(artworkId, this.artworkMapper.toEntity(artworkDomain)));
	}

	@Override
	public List<ArtworkDomain> getArtworkByArtist(String artistId) throws Exception {
		return this.artworkMapper.asDomainList(this.artworkApiClient.getArtworkByArtist(artistId));
	}

}
