package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.ArtworkDomain;

public interface ArtworkService {
	
	public List<ArtworkDomain> getAllArtworks() throws Exception;
	
	public ArtworkDomain getArtworkById(String artworkId) throws Exception;
	
	public void deleteArtwork(String artworkId) throws Exception;
	
	public String saveArtwork(ArtworkDomain artworkDomain) throws Exception;
	
	public ArtworkDomain updateArtwork(String artworkId, ArtworkDomain artworkDomain) throws Exception;
	
	public List<ArtworkDomain> getArtworkByArtist(String artistId) throws Exception;

}
