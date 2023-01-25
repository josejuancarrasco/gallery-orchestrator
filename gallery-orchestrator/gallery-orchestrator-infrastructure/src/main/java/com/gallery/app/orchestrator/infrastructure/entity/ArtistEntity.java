package com.gallery.app.orchestrator.infrastructure.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ArtistEntity implements Serializable {

	private static final long serialVersionUID = -6395067214252021487L;

	private String artistId;

	private String givenNames;
	
	private String surnames;

}
