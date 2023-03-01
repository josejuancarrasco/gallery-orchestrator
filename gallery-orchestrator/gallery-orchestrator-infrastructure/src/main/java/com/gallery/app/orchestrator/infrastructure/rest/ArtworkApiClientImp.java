package com.gallery.app.orchestrator.infrastructure.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.gallery.app.orchestrator.infrastructure.entity.ArtworkEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ArtworkApiClientImp implements ArtworkApiClient{

	@Autowired
	private RestTemplate restTemplate;

	@Value("${gallery-host.artwork}")
	private String artworkHost;
	
	@Override
	public List<ArtworkEntity> getAllArtworks() throws Exception {
		
		ResponseEntity<List<ArtworkEntity>> response = null;

		try {

			response = restTemplate.exchange(artworkHost, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<ArtworkEntity>>() {
					});

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

		return response.getBody();
	}

	@Override
	public ArtworkEntity getArtworkById(String artworkId) throws Exception {
		ResponseEntity<ArtworkEntity> response = null;

		try {

			response = restTemplate.getForEntity(artworkHost + artworkId, ArtworkEntity.class);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

		return response.getBody();
	}

	@Override
	public void deleteArtwork(String artworkId) throws Exception {
		try {

			restTemplate.delete(artworkHost + artworkId);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}
		
	}

	@Override
	public String saveArtwork(ArtworkEntity artworkEntity) throws Exception {	

		ResponseEntity<ArtworkEntity> response = null;
		
		try {

			response = restTemplate.postForEntity(artworkHost, artworkEntity, ArtworkEntity.class);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}
		
		return response.getBody().getArtworkId();
		
	}

	@Override
	public ArtworkEntity updateArtwork(String artworkId, ArtworkEntity artworkEntity) throws Exception {
		ResponseEntity<ArtworkEntity> response = null;
		
		final HttpEntity<ArtworkEntity> entity = new HttpEntity<ArtworkEntity>(artworkEntity);
		
		try {
			response = restTemplate.exchange(artworkHost + artworkId, HttpMethod.PUT, entity, ArtworkEntity.class);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

		return response.getBody();
	}

	@Override
	public List<ArtworkEntity> getArtworkByArtist(String artistId) throws Exception {
		ResponseEntity<List<ArtworkEntity>> response = null;

		try {

			response = restTemplate.exchange(artworkHost + "/artist/" + artistId, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<ArtworkEntity>>() {
					});

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

		return response.getBody();
	}

}
