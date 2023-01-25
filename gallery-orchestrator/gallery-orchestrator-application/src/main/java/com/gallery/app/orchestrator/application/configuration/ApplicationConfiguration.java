package com.gallery.app.orchestrator.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gallery.app.orchestrator.domain.api.ArtistService;
import com.gallery.app.orchestrator.domain.api.ArtistServiceImp;
import com.gallery.app.orchestrator.domain.port.ArtistPort;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public ArtistService getArtistService(final ArtistPort artistPort) {
		return new ArtistServiceImp(artistPort);
	}

}
