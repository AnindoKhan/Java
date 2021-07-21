package com.codingdojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.mvc.models.License;
import com.codingdojo.mvc.models.Person;
import com.codingdojo.mvc.services.LicenseService;
import com.codingdojo.mvc.services.PersonService;

@Controller
public class MainController {
	@Autowired
	private PersonService personService;
	@Autowired
	private LicenseService licenseService;

	@GetMapping("")
	public String redirect() {
		return "redirect:/persons";
	}
	@GetMapping("/persons")
	public String index(Model model) {
		List<Person> persons = personService.findAllPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
	@GetMapping("/persons/new")
	public String newPersonForm(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newPerson.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/";
		}
	}
	@GetMapping("/licenses/new")
	public String newLicenseForm(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.findAllPersons();
		model.addAttribute("persons", persons);
		return "newLicense.jsp";
	}
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Person> persons = personService.findAllPersons();
			model.addAttribute("persons", persons);
			return "newLicense.jsp";
		}else {
			license.setNumber(String.format("%05d", license.getPerson().getId()));
			licenseService.createLicense(license);
			return "redirect:/";
		}
	}
		
	
}
