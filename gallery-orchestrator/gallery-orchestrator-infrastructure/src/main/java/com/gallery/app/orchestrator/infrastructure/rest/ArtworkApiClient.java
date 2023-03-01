package com.gallery.app.orchestrator.infrastructure.rest;

import java.util.List;

import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity;

public interface ArtworkApiClient {

	public List<ArtworkEntity> getAllArtworks() throws Exception;
	
	public ArtworkEntity getArtworkById(String artworkId) throws Exception;
	
	public void deleteArtwork(String artworkId) throws Exception;
	
	public String saveArtwork(ArtworkEntity artworkEntity) throws Exception;
	
	public ArtworkEntity updateArtwork(String artworkId, ArtworkEntity artworkEntity) throws Exception;
	
	public List<ArtworkEntity> getArtworkByArtist(String artistId) throws Exception;
}
