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

import com.jarana.entities.Tax;
import com.jarana.service.TaxService;

@Controller
@RequestMapping("/tax")
public class TaxController { 

	@Autowired
	private TaxService taxService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Tax> findAll() {
		return taxService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Tax find(@PathVariable("id") Type PK) {
//		return taxService.findOne(PK);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}/", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Tax> findBy-ReplaceFIELD(TYPE FIELD) {
//		return taxService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Tax tax) {
		taxService.create(tax);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Tax tax) {
		taxService.update(tax);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Tax tax) {
		taxService.delete(tax);
	}

}
