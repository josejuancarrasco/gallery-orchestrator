package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.ArtworkDomain;
import com.gallery.app.orchestrator.domain.port.ArtworkPort;

public class ArtworkServiceImp implements ArtworkService{
	
	private final ArtworkPort artworkPort;
	
	public ArtworkServiceImp(final ArtworkPort artworkPort) {
		this.artworkPort = artworkPort;
	}

	@Override
	public List<ArtworkDomain> getAllArtworks() throws Exception {		
		return this.artworkPort.getAllArtworks();
	}

	@Override
	public ArtworkDomain getArtworkById(String artworkId) throws Exception {
		return this.artworkPort.getArtworkById(artworkId);
	}

	@Override
	public void deleteArtwork(String artworkId) throws Exception {
		this.artworkPort.deleteArtwork(artworkId);
	}

	@Override
	public String saveArtwork(ArtworkDomain artworkDomain) throws Exception {
		return this.artworkPort.saveArtwork(artworkDomain);
	}

	@Override
	public ArtworkDomain updateArtwork(String artworkId, ArtworkDomain artworkDomain) throws Exception {
		return this.artworkPort.updateArtwork(artworkId, artworkDomain);
	}

	@Override
	public List<ArtworkDomain> getArtworkByArtist(String artistId) throws Exception {
		return this.artworkPort.getArtworkByArtist(artistId);
	}

}
