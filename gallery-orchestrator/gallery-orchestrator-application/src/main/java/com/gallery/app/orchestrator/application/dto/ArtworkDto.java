package com.gallery.app.orchestrator.application.dto;

import java.io.Serializable;

import com.gallery.app.orchestrator.domain.common.ArtworkStatusEnum;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ArtworkDto implements Serializable{

	private static final long serialVersionUID = 860233197317052081L;

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
