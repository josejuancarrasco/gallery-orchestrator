package com.gallery.app.orchestrator.application.controller;

import java.util.Base64;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gallery.app.orchestrator.application.dto.ArtistDto;
import com.gallery.app.orchestrator.application.dto.ArtworkDto;
import com.gallery.app.orchestrator.application.dto.TransactionDto;
import com.gallery.app.orchestrator.application.mapper.ArtistMapper;
import com.gallery.app.orchestrator.application.mapper.ArtworkMapper;
import com.gallery.app.orchestrator.application.mapper.TransactionMapper;
import com.gallery.app.orchestrator.domain.api.ArtistService;
import com.gallery.app.orchestrator.domain.api.ArtworkService;
import com.gallery.app.orchestrator.domain.api.TransactionService;

@Controller
@RequestMapping(value = "/artwork")
public class GalleryArtworkController {
	
	@Autowired
	private  ArtworkService artworkService;
	
	@Autowired
	private  ArtworkMapper artworkMapper;
	
	@Autowired
	private  ArtistService artistService;
	
	@Autowired
	private ArtistMapper artistMapper;
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private TransactionMapper transactionMapper;
	
	
	@GetMapping(value = "/add/")
	public String addArtwork(Model model) throws Exception {
		
		ArtworkDto artwork = new ArtworkDto();
		TransactionDto transaction =  new TransactionDto();
		List<ArtistDto> artistList = this.artistMapper.asListArtistDto(this.artistService.getAllArtist());
		
		model.addAttribute("editar", false);
		
		model.addAttribute("artwork", artwork);
		
		model.addAttribute("transaction", transaction);
		
		model.addAttribute("artistList", artistList);
		
		return "artwork/artworkSave";
	}
	
	@PostMapping(value = "/save/")
	public String saveArtwork(@Valid ArtworkDto artworkDto,@Valid TransactionDto transactionDto, BindingResult result, Model model,@RequestParam("file") MultipartFile file ) throws Exception {
		
		if (result.hasErrors()) {
			
			model.addAttribute( "artistList", this.artistMapper.asListArtistDto(this.artistService.getAllArtist()) );
			
			return "artwork/artworkSave";
		}
		
		if (!file.isEmpty()) {
			artworkDto.setPhoto(Base64.getEncoder().encodeToString(file.getBytes()));
		}
		
		String artworkId = this.artworkService.saveArtwork(this.artworkMapper.toDomain(artworkDto));
		transactionDto.setArtworkId(artworkId);
		
		this.transactionService.saveTransaction(this.transactionMapper.toDomain(transactionDto));
		
		return "redirect:/artwork/details/" + artworkId;
	}
	
	@GetMapping(value = "/list/")
	public String getAllArtworks(Model model) throws Exception {
	
		List<ArtworkDto> artworkList = this.artworkMapper.asListDto(this.artworkService.getAllArtworks());	
		model.addAttribute("artworkList",artworkList);
		
		return "artwork/artworkList";
	}
	
	@GetMapping(value = "/{id}")
	public String getArtworkById(@PathVariable(value = "id") String id, Model model) throws Exception {
		
		ArtworkDto artworkDto = this.artworkMapper.toDto(this.artworkService.getArtworkById(id)); 
		model.addAttribute("artwork", artworkDto);
		
		return "artwork/artwork";
	}
	
	@GetMapping(value = "/delete/{id}")
	public String deleteArtwork(@PathVariable( value = "id") String id ) throws Exception {
		this.artworkService.deleteArtwork(id);
		return "redirect:/artwork/list/";
	}
	
	@GetMapping(value = "/details/{id}")
	public String getArworkDetails(@PathVariable(value = "id") String id, Model model ) throws Exception {
		
		ArtworkDto artwork = this.artworkMapper.toDto(this.artworkService.getArtworkById(id));
		ArtistDto artist = this.artistMapper.toDto(this.artistService.getArtistById(artwork.getArtistId()));
		List<TransactionDto> transactionList = this.transactionMapper.asDtoList(this.transactionService.getTransactionByArtwork(id));
		
		model.addAttribute("artwork", artwork);
		model.addAttribute("artist", artist);
		model.addAttribute("transactionList", transactionList);
		
		return "artwork/artworkDetails";
	}
	
	@GetMapping(value = "/artist/{id}")
	public String getArtworkByArtist(@PathVariable(value = "id") String id, Model model) throws Exception {
		
		List<ArtworkDto> artworkList = this.artworkMapper.asListDto(this.artworkService.getArtworkByArtist(id));
		model.addAttribute("artworkList", artworkList);
		return "artwork/artworkList";
	}
	
	
	
}
