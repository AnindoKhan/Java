package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Team;
@Repository
public interface TeamRepo extends CrudRepository<Team, Long> {
	List<Team> findAll();
}
