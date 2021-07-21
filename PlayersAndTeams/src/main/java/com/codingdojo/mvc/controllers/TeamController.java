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

import com.codingdojo.mvc.models.Team;
import com.codingdojo.mvc.models.User;
import com.codingdojo.mvc.services.TeamService;
import com.codingdojo.mvc.services.UserService;

@Controller
public class TeamController {
	@Autowired
	UserService userService;
	@Autowired
	TeamService teamService;
	
	@GetMapping("/createTeam")
	public String createTeam(@ModelAttribute("team") Team team, Model model, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
		if(id != null) {
    		User loggedInUser = userService.findUserById(id);
    		model.addAttribute("users",userService.allUsers());
    		model.addAttribute("teams", teamService.allTeams());
    		model.addAttribute("user", loggedInUser);
    		return "CreateTeam.jsp";
    	}
    	
    	return "redirect:/login";
    	}

	@PostMapping("deleteTeam/{id}")
	public String deleteTeam(@PathVariable("id") Long teamId) {
		teamService.delete(teamId);
		return "redirect:/createTeam";
	}
	@PostMapping("/createTeam")
	public String newTeam(@Valid @ModelAttribute("team") Team team, BindingResult result, Model model, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
    	User loggedInUser = userService.findUserById(id);

		if(result.hasErrors()) {
    		model.addAttribute("user", loggedInUser);
    		model.addAttribute("teams", teamService.allTeams());
    		model.addAttribute("users", userService.allUsers());
    		return "createTeam.jsp";
		}else {
			System.out.println("you created a team");
			teamService.save(team);
			return "redirect:/createTeam";
		}
	}
	@PostMapping("/joinTeam/{id}")
	public String joinTeam(@PathVariable("id") Long teamId,HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
    	User loggedInUser = userService.findUserById(id);
    	
    	Team team = teamService.findTeamById(teamId);
    	loggedInUser.setTeam(team);
    	userService.updateUser(loggedInUser);
    	return "redirect:/createTeam";
	}
	@GetMapping("/editTeam/{id}")
	public String edit(@PathVariable("id") Long teamId, HttpSession session, Model Model) {
		Long id = (Long) session.getAttribute("userId");
    	User loggedInUser = userService.findUserById(id);
    	Model.addAttribute("theTeam", teamService.findTeamById(teamId));
    	return "editTeam.jsp";
	}
}