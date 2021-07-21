package com.codingdojo.mvc;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.mvc.models.Language;
import com.codingdojo.mvc.services.LanguageService;
@Controller
public class LanguageController {
	private final LanguageService languageService;
	public LanguageController(LanguageService languageService) {
		this.languageService=languageService;
	}
	@RequestMapping("/languages")
	public String index (@ModelAttribute("language") Language language, Model model) {
		List <Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}/delete", method= RequestMethod.POST)
	public String destroy(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language=languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()){
			return "edit.jsp";
		}else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	@RequestMapping("/languages/{id}")
	public String show(@ModelAttribute("language") Language language,@PathVariable("id") Long id, Model model) {
		Language lang =languageService.findLanguage(id);
		model.addAttribute("language", lang);
		return "info.jsp";
	}
}
