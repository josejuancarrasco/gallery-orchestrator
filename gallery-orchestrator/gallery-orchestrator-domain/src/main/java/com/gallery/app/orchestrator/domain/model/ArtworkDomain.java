package com.gallery.app.orchestrator.domain.model;

import com.gallery.app.orchestrator.domain.common.ArtworkStatusEnum;

import lombok.Data;

@Data
public class ArtworkDomain {

	private String artworkId;
	
	private String title;
	
	private String description;
	
	private Boolean signed;
	
	private String numeration;
	
	private String editor;
	
	private String photo;
	
	private ArtworkStatusEnum artworkStatus;
	
	private String artistId;
	
	private String clientId;	
}
