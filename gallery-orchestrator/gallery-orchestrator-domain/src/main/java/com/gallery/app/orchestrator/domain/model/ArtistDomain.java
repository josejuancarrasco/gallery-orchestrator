package com.gallery.app.orchestrator.domain.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDomain  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String artistId;

	private String givenNames;

	private String surnames;
	
}
