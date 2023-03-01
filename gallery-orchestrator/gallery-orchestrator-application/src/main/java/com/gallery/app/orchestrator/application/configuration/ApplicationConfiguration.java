package com.gallery.app.orchestrator.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gallery.app.orchestrator.domain.api.ArtistService;
import com.gallery.app.orchestrator.domain.api.ArtistServiceImp;
import com.gallery.app.orchestrator.domain.api.ArtworkService;
import com.gallery.app.orchestrator.domain.api.ArtworkServiceImp;
import com.gallery.app.orchestrator.domain.api.TransactionService;
import com.gallery.app.orchestrator.domain.api.TransactionServiceImp;
import com.gallery.app.orchestrator.domain.port.ArtistPort;
import com.gallery.app.orchestrator.domain.port.ArtworkPort;
import com.gallery.app.orchestrator.domain.port.TransactionPort;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public ArtistService getArtistService(final ArtistPort artistPort) {
		return new ArtistServiceImp(artistPort);
	}
	
	@Bean
	public ArtworkService getArtworkService(final ArtworkPort artworkPort) {
		return new ArtworkServiceImp(artworkPort);
	}
	
	@Bean
	public TransactionService getTransactionService(TransactionPort transactionPort) {
		return new TransactionServiceImp(transactionPort);
	}
	

}
