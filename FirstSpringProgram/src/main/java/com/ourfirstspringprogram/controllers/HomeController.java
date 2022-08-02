package com.ourfirstspringprogram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ourfirstspringprogram.models.Animal;

@Controller
@RequestMapping("/")
public class HomeController {
//	@GetMapping("/")
//	public String index() {
//		return "index";
//	}
	
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("animal", new Animal());
		return "index";
	}
	
	@PostMapping("/animal")
	public String animalSubmit(@ModelAttribute Animal animal) {
		return "result";
	}
	
}
