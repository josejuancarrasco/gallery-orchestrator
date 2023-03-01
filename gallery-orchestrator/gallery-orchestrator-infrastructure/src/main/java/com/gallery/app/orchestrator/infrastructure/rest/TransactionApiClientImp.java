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

import com.gallery.app.orchestrator.infrastructure.entity.TransactionEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TransactionApiClientImp implements TransactionApiClient{

	@Autowired
	private RestTemplate restTemplate;

	@Value("${gallery-host.transaction}")
	private String transactionHost;
	
	@Override
	public List<TransactionEntity> getAllTransaction() throws Exception {
		ResponseEntity<List<TransactionEntity>> response = null;

		try {

			response = restTemplate.exchange(transactionHost, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<TransactionEntity>>() {
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
	public TransactionEntity getTransactionById(String transactionId) throws Exception {
		ResponseEntity<TransactionEntity> response = null;

		try {

			response = restTemplate.getForEntity(transactionHost + transactionId, TransactionEntity.class);

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
	public void deleteTransaction(String transactionId) throws Exception {
		try {

			 restTemplate.delete(transactionHost + transactionId);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}
		
	}

	@Override
	public void saveTransaction(TransactionEntity TransactionEntity) throws Exception {

		try {

			restTemplate.postForEntity(transactionHost, TransactionEntity, TransactionEntity.class);

		} catch (final HttpClientErrorException cliEx) {
			log.error("Exception: " + cliEx.getLocalizedMessage());
			throw new Exception(cliEx.getMessage());

		} catch (final RestClientException restEx) {
			log.error("Exception: " + restEx.getLocalizedMessage());
			throw new Exception(restEx.getMessage());
		}

	}

	@Override
	public TransactionEntity updateTransaction(String transactionId, TransactionEntity transactionEntity)
			throws Exception {
		ResponseEntity<TransactionEntity> response = null;
		
		final HttpEntity<TransactionEntity> entity = new HttpEntity<TransactionEntity>(transactionEntity);
		
		try {
			response = restTemplate.exchange(transactionHost + transactionId, HttpMethod.PUT, entity, TransactionEntity.class);

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
	public List<TransactionEntity> getTransactionByArtwork(String artworkId) throws Exception {
		ResponseEntity<List<TransactionEntity>> response = null;
			
		try {
			response = restTemplate.exchange(transactionHost + "/artwork/" + artworkId, HttpMethod.GET, null, new ParameterizedTypeReference<List<TransactionEntity>>() {
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
