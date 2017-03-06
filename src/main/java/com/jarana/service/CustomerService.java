package com.jarana.service;
import java.util.List;

import com.jarana.entities.Customer;
public interface CustomerService {
	public List<Customer> findAll();
	public Customer findOne(Long cuCustomerId);
	public List<Customer> findBycuFirstName(String cuFirstName);
	public List<Customer> findBycuLastName(String cuLastName);
	public void create (Customer customer);
	public void update (Customer customer);
	public void delete (Customer customer);
}
