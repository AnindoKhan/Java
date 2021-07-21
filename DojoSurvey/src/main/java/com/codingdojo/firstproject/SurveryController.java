package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveryController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value ="/result", method=RequestMethod.POST)
	public String survey(
			@RequestParam String name, 
			@RequestParam String language, 
			@RequestParam String location, 
			@RequestParam String comment,
			Model model){
		model.addAttribute("name", name);
		model.addAttribute("language", language);
		model.addAttribute("location", location);
		model.addAttribute("comment", comment);
		return "results.jsp";
	}
}
