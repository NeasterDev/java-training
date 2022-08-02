package com.springl03practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springl03practice.models.Story;

// lets class know it is a controller
@Controller
// default route
@RequestMapping("/")
public class HomeController {
	// for route beginning
	@GetMapping("/beginning")
	public String beginning() {
		// return beginning.html
		return "beginning";
	};
	
	// for route middle
	@GetMapping("/middle")
	public String middle() {
		// return middle.html
		return "middle";
	};
	
	@GetMapping("/end")
	public String end() {
		return "end";
	};
	
	@GetMapping()
	public String fullstory(Model model) {
		model.addAttribute("story", new Story());
		return "fullStory";
	}
	
	@PostMapping("/story")
	public String storySubmit(@ModelAttribute Story story) {
		return "result";
	}
}
