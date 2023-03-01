package com.gallery.app.orchestrator.infrastructure.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.gallery.app.orchestrator.domain.port.ArtistPort;
import com.gallery.app.orchestrator.domain.port.ArtworkPort;
import com.gallery.app.orchestrator.domain.port.TransactionPort;
import com.gallery.app.orchestrator.infrastructure.adapter.ArtistAdapter;
import com.gallery.app.orchestrator.infrastructure.adapter.ArtworkAdapter;
import com.gallery.app.orchestrator.infrastructure.adapter.TransactionAdapter;


@Configuration
public class InfrastuctureConfiguration {

	@Bean
	public ArtistPort getArtistPort() {
		return new ArtistAdapter();
	}
	
	@Bean
	public ArtworkPort getArtworkPort() {
		return new ArtworkAdapter();
	}
	
	@Bean
	public TransactionPort getTransactionPort() {
		return new TransactionAdapter();
	}	

	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

}
