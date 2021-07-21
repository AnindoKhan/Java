package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
	List<User> findAll();
	User findByEmail(String email);
}
