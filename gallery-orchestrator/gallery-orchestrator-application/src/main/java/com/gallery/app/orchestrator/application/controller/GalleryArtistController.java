package com.gallery.app.orchestrator.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gallery.app.orchestrator.application.dto.ArtistDto;
import com.gallery.app.orchestrator.application.mapper.ArtistMapper;
import com.gallery.app.orchestrator.domain.api.ArtistService;

@Controller
@RequestMapping("/artist")
public class GalleryArtistController {

	private ArtistService artistService;

	private ArtistMapper artistMapper;

	public GalleryArtistController(ArtistService artistService, ArtistMapper artistMapper) {
		this.artistService = artistService;
		this.artistMapper = artistMapper;
	}

	@GetMapping(value = "/add/")
	public String addArtist(Model model) {

		ArtistDto artistDto = new ArtistDto();

		model.addAttribute("artist", artistDto);

		return "artist/artist";
	}

	@PostMapping(value = "/save/")
	public String saveArtist(@Valid ArtistDto artistDto, BindingResult result) throws Exception {

		if (result.hasErrors()) {
			return "artist/artist";
		}

		this.artistService.saveArtist(this.artistMapper.toDomain(artistDto));

		return "redirect:/artist/list/";
	}

	@GetMapping(value = "/list/")
	public String getAllArtist(Model model) throws Exception {

		List<ArtistDto> artistList = this.artistMapper.asListArtistDto(this.artistService.getAllArtist()); 
		model.addAttribute("artistList", artistList);

		return "artist/artistList";
	}

	@GetMapping(value = "/{id}")
	public String getArtistById(@PathVariable(value = "id") String artistId, Model model) throws Exception {
		ArtistDto artistDto = this.artistMapper.toDto(this.artistService.getArtistById(artistId));
		model.addAttribute("edit", true);
		model.addAttribute("artist", artistDto);
		return "artist/artist";
	}
	
	@PostMapping(value = "/update/{id}")
	public String updateArtist(@PathVariable(value = "id") String artistId, ArtistDto artist, Model model, BindingResult result) throws Exception {

		if (result.hasErrors()) {
			return "artist/artist";
		}	
		
		this.artistService.updateArtist(artistId, this.artistMapper.toDomain(artist));
		
		return "redirect:/artist/list/";	
	}

	@GetMapping(value = "/delete/{id}")
	public String deleteArtistById(@PathVariable(value = "id") String id) throws Exception {	
		this.artistService.deleteArtist(id);
		return "redirect:/artist/list/";
	}
}
