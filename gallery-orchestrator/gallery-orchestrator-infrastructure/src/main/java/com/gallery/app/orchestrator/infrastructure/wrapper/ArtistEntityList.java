package com.gallery.app.orchestrator.infrastructure.wrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.gallery.app.orchestrator.infrastructure.entity.ArtistEntity;


import lombok.Data;

@Data

public class ArtistEntityList implements Serializable{
	
	
	private static final long serialVersionUID = -6133922002060165213L;
	private List<ArtistEntity> artistList;
	
	public ArtistEntityList() {
		artistList = new ArrayList<>();
	}

}
