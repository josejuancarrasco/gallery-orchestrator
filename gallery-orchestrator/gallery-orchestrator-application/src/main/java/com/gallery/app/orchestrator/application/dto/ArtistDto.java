package com.gallery.app.orchestrator.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String artistId;

	@NotBlank
	private String givenNames;
	@NotBlank
	private String surnames;

}
