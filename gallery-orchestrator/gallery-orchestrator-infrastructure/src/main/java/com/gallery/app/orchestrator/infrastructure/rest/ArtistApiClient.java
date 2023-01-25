package com.gallery.app.orchestrator.infrastructure.rest;

import java.util.List;

import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;

public interface ArtistApiClient {
	
	public ArtistEntity getArtistById(String artistId) throws Exception;

	public List<ArtistEntity> getAllArtist() throws Exception;
	
	public String saveArtist(ArtistEntity artist) throws Exception;
	
	public ArtistEntity updateArtist(String artistId, ArtistEntity artist) throws Exception;
	
	public void deleteArtist(String artistId) throws Exception;
}
