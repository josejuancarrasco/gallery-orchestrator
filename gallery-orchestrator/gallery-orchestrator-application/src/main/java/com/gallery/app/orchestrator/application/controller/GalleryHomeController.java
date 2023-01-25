package com.gallery.app.orchestrator.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GalleryHomeController {
	
	@GetMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("titulo", "Soy el titulo");
		return "index";
	}

}
