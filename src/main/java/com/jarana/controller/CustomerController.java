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

import com.jarana.entities.Customer;
import com.jarana.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController { 

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Customer find(@PathVariable("id") Long id) {
		return customerService.findOne(id);
	}
	
	@RequestMapping(value = "/name/{cuFirstName}", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> findBycuFirstName(@PathVariable ("cuFirstName") String cuFirstName) {
		return customerService.findBycuFirstName(cuFirstName);
	}

	@RequestMapping(value = "/lname/{cuLastName}", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> findBycuLastName(@PathVariable ("cuLastName") String cuLastName) {
		return customerService.findBycuLastName(cuLastName);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Customer customer) {
		customerService.create(customer);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Customer customer) {
		customerService.update(customer);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Customer customer) {
		customerService.delete(customer);
	}

}
