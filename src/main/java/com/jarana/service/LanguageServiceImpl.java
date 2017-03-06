package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Language;
import com.jarana.repository.LanguageDAO;

@Transactional
@Service("languageService")
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageDAO languageDAO;

	public List<Language> findAll() {
		List<Language> listLanguage = languageDAO.findAll();
		return listLanguage;
	}

//	public Language findOne(TYPE PK) {
//		return languageDAO.findOne(PK);
//	}

//	public List<Language> findBy-ReplaceFIELD(TYPE FIELD) {
//		return languageDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Language language) {
		languageDAO.save(language);
	}

	public void update (Language language) {
		languageDAO.save(language);
	}

	public void delete (Language language) {
		languageDAO.delete(language);
	}

}
