package com.codingdojo.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.License;
@Repository
public interface LicenseRepo extends CrudRepository <License, Long> {
	List<License>findAll();
}
