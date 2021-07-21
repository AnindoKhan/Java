package com.codingdojo.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.mvc.models.Language;

public interface LanguageRepository extends CrudRepository <Language, Long> {
	List<Language> findAll();
	Long countByNameContaining(String search);
    Long deleteByNameStartingWith(String search);
}
