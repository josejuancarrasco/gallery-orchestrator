package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;

public interface ArtistService {

	public List<ArtistDomain> getAllArtist() throws Exception;
	
	public ArtistDomain getArtistById(String artistId) throws Exception;
	
	public void deleteArtist(String artistId) throws Exception;
	
	public void saveArtist(ArtistDomain artist) throws Exception;
	
	public ArtistDomain updateArtist(String artistId, ArtistDomain artist) throws Exception;
}
