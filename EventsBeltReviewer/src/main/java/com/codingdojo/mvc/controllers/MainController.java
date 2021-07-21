package com.codingdojo.mvc.controllers;

import java.util.Date;
import java.util.List;

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

import com.codingdojo.mvc.models.Event;
import com.codingdojo.mvc.models.User;
import com.codingdojo.mvc.services.EventService;
import com.codingdojo.mvc.services.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	@Autowired
	EventService eventService;
	
	@GetMapping("/home")
	public String addEvent(@ModelAttribute("events") Event event,HttpSession session, Model model) {
		User user =userService.findUserById((Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		model.addAttribute("inStateEvents", eventService.findStateEvents(user.getState(), true));
		model.addAttribute("notInStateEvents", eventService.findStateEvents(user.getState(), false));
		return "homePage.jsp";
	}
	@PostMapping("/createEvent")
	public String createEvent(@Valid @ModelAttribute("events") Event event, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "homePage.jsp";
		}else {
			System.out.println(event);
			eventService.saveEvent(event);
			return "redirect:/home";
		}
	}
	@GetMapping("/event/{id}")
	public String eventInfo(@PathVariable("id") long eventId, Model model) {
		model.addAttribute("event", eventService.findEventById(eventId));
		return "eventInfo.jsp";
	}
	@GetMapping("/event/{id}/delete")
	public String deleteEvent(@PathVariable("id") long eventId) {
		eventService.deleteEvent(eventId);
		return "redirect:/home";
	}
	@GetMapping("event/{id}/edit")
	public String updateEvent(@PathVariable("id") long eventId, Model model, HttpSession session) {
		User user =userService.findUserById((Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		model.addAttribute("event",eventService.findEventById(eventId));
		return "editEvent.jsp";
	}
	@PostMapping("event/{id}/edit")
	public String editEvent(@Valid @PathVariable("id") long eventId, @RequestParam("name") String name, @RequestParam("date") Date date, @RequestParam("location") String location, 
			@RequestParam("state") String state,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("event", eventService.findEventById(eventId));
			return "editEvent.jsp";
		}else {
			Event event = eventService.findEventById(eventId);
			event.setDate(date);
			event.setName(name);
			event.setLocation(location);
			event.setState(state);
			eventService.saveEvent(eventService.findEventById(eventId));
			return "redirect:/home";
		}
	}
}
