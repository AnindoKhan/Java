package com.codingdojo.mvc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.mvc.models.Dojo;
import com.codingdojo.mvc.models.Ninja;
import com.codingdojo.mvc.services.DojoService;
import com.codingdojo.mvc.services.NinjaService;

@Controller
public class MainController {
	@Autowired 
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("dojos" , dojoService.findAllDojos());
		return "index.jsp";
	}
	@GetMapping("/createDojo")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}else {
			dojoService.createdojo(dojo);
			return "redirect:/";
		}
	}
	@GetMapping("/createNinja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.findAllDojos());
		return "newNinja.jsp";
	}
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	
	}

 