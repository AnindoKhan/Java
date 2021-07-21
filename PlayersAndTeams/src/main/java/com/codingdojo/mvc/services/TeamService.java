package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Team;
import com.codingdojo.mvc.repos.TeamRepo;

@Service
public class TeamService {
	@Autowired 
	private TeamRepo teamRepo;
	
	public List<Team> allTeams(){
		return teamRepo.findAll();
	}
	public Team findTeamById(Long id){
		Optional<Team> team = teamRepo.findById(id);
		if (team.isPresent()) {
			return team.get();
		} else {
			return null;
		}
	}
	public Team save(Team team){
		return teamRepo.save(team);
	}
	public void delete(Long id) {
		teamRepo.deleteById(id);
	}
}
