package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Language;

@Repository("languageDAO")
public interface LanguageDAO extends JpaRepository<Language, Integer> {

	 //List<Language> findBy-ReplaceFIELD(TYPE FIELD);
}
