package com.jarana.controller
;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.Language;
import com.jarana.service.LanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController { 

	@Autowired
	private LanguageService languageService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Language> findAll() {
		return languageService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Language find(@PathVariable("id") Type PK) {
//		return languageService.findOne(PK);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}/", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Language> findBy-ReplaceFIELD(TYPE FIELD) {
//		return languageService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Language language) {
		languageService.create(language);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Language language) {
		languageService.update(language);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Language language) {
		languageService.delete(language);
	}

}
