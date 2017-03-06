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

import com.jarana.entities.Sale;
import com.jarana.service.SaleService;

@Controller
@RequestMapping("/sale")
public class SaleController { 

	@Autowired
	private SaleService saleService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Sale> findAll() {
		return saleService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Sale find(@PathVariable("id") Type PK) {
//		return saleService.findOne(PK);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}/", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Sale> findBy-ReplaceFIELD(TYPE FIELD) {
//		return saleService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Sale sale) {
		saleService.create(sale);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Sale sale) {
		saleService.update(sale);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Sale sale) {
		saleService.delete(sale);
	}

}
