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

import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ArtistApiClientImp implements ArtistApiClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${gallery-host.artist}")
	private String artistHost;

	@Override
	public ArtistEntity getArtistById(String artistId) throws Exception {

		ResponseEntity<ArtistEntity> response = null;

		try {

			response = restTemplate.getForEntity(artistHost + artistId, ArtistEntity.class);

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
	public List<ArtistEntity> getAllArtist() throws Exception {

		ResponseEntity<List<ArtistEntity>> response = null;

		try {

			response = restTemplate.exchange(artistHost, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<ArtistEntity>>() {
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
	public String saveArtist(ArtistEntity artist) throws Exception {

		ResponseEntity<String> response = null;

		try {

			response = restTemplate.postForEntity(artistHost, artist, String.class);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

		return response.getBody().toString();
	}

	@Override
	public ArtistEntity updateArtist(String artistId, ArtistEntity artist) throws Exception {

		ResponseEntity<ArtistEntity> response = null;
		
		final HttpEntity<ArtistEntity> entity = new HttpEntity<ArtistEntity>(artist);
		
		try {
			response = restTemplate.exchange(artistHost + artistId, HttpMethod.PUT, entity, ArtistEntity.class);

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
	public void deleteArtist(String artistId) throws Exception {

		try {

			restTemplate.delete(artistHost + artistId);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

	}

}
