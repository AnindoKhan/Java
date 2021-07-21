package com.codingdojo.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.mvc.models.Rating;
import com.codingdojo.mvc.models.Show;
import com.codingdojo.mvc.models.User;
import com.codingdojo.mvc.services.RatingService;
import com.codingdojo.mvc.services.ShowService;
import com.codingdojo.mvc.services.UserService;

@Controller
public class MainController {
	@Autowired
	ShowService showService;
	@Autowired
	RatingService ratingService;
	@Autowired
	UserService userService;
	
	@GetMapping ("/addShow")
	public String addShow(@ModelAttribute("shows") Show show, Model model, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
		if(id != null) {
    		User loggedInUser = userService.findUserById(id);
    		model.addAttribute("user", loggedInUser);
    		return "createShow.jsp";
    	}
		return "redirect:/login";
	}
	@PostMapping("/addShow")
	public String createShow(@Valid @ModelAttribute("shows") Show show, BindingResult result, Model model, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
    	User loggedInUser = userService.findUserById(id);
    	if (result.hasErrors()) {
    		model.addAttribute("user", loggedInUser);
    		model.addAttribute("shows",showService.allShows());
    		return "createShow.jsp";
    	}else {
    		showService.createShow(show);
    		model.addAttribute("theShows", showService.allShows());
    		return "redirect:/home";
    	}
	}
	@GetMapping("/shows/{id}")
	public String showInfo(@ModelAttribute("rating") Rating rating, @PathVariable("id") long showId, Model model,HttpSession session ) {
		model.addAttribute("currentShow", showService.findShowById(showId));
		return "showInfo.jsp";
	}
//	@PostMapping("/addRating")
//	public String addRating("")
//	
	@GetMapping("/shows/{id}/edit")
	public String editShow(@PathVariable("id") long showId, Model model,HttpSession session) {
		model.addAttribute("currentShow", showService.findShowById(showId));
		return "editShow.jsp";
	}
	@PostMapping("/shows/{id}/edit")
	public String updateShow(@PathVariable("id") long showId,
			@RequestParam("title") String title,
			@RequestParam("network") String network,
			Model model,HttpSession session) {
		showService.updateShow(showId, title, network);
		return "redirect:/home";
		
	}
	@GetMapping("/shows/{id}/delete")
	public String deleteShow(@PathVariable("id") Long showId) {
		showService.deleteShow(showId);
		return "redirect:/home";
	}
	@PostMapping("/addRating/{id}")
	public String rateShow( @Valid @ModelAttribute("rating") Rating rating ,@PathVariable("id") Long showId,
			BindingResult result, Model model, 
			HttpSession session ) {
		
		Show show = showService.findShowById(showId);
		rating.setTvShow(show);
		ratingService.createRating(rating);
		return "redirect:/home";
	}
}
