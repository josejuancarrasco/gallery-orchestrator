package com.gallery.app.orchestrator.domain.api;

import java.util.List;

import com.gallery.app.orchestrator.domain.model.ArtistDomain;
import com.gallery.app.orchestrator.domain.port.ArtistPort;

public class ArtistServiceImp implements ArtistService{
	
	private final ArtistPort artistPort;
	
	public ArtistServiceImp(final ArtistPort artistPort) {
		this.artistPort = artistPort;
	}

	@Override
	public List<ArtistDomain> getAllArtist() throws Exception {
		return this.artistPort.listArtist();
	}

	@Override
	public ArtistDomain getArtistById(String artistId) throws Exception{
		
		return this.artistPort.getArtistById(artistId);
	}

	@Override
	public void deleteArtist(String artistId) throws Exception{
		this.artistPort.deleteArtist(artistId);
		
	}

	@Override
	public void saveArtist(ArtistDomain artist) throws Exception {
		this.artistPort.saveArtist(artist);
		
	}

	@Override
	public ArtistDomain updateArtist(String artistId, ArtistDomain artist) throws Exception {
		return this.artistPort.updateArtist(artistId, artist);
		
	}

}
