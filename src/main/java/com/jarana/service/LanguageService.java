package com.jarana.service;
import java.util.List;

import com.jarana.entities.Language;
public interface LanguageService {
	public List<Language> findAll();
//	public Language findOne(TYPE PK);
//	public List<Language> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Language language);
	public void update (Language language);
	public void delete (Language language);
}
