package com.gallery.app.orchestrator.infrastructure.entity;

import java.io.Serializable;

import com.gallery.app.orchestrator.domain.common.ArtworkStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ArtworkEntity implements Serializable{

	private static final long serialVersionUID = 1887824120823486752L;

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
