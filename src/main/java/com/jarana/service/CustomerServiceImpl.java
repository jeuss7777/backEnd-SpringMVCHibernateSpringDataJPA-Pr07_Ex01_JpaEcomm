package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Customer;
import com.jarana.repository.CustomerDAO;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> findAll() {
		List<Customer> listCustomer = customerDAO.findAll();
		return listCustomer;
	}

	public Customer findOne(Long cuCustomerId) {
		return customerDAO.findOne(cuCustomerId);
	}

	public List<Customer> findBycuFirstName(String cuFirstName) {
		return customerDAO.findBycuFirstName(cuFirstName);
	}
	
	public List<Customer> findBycuLastName(String cuLastName) {
		return customerDAO.findBycuLastName(cuLastName);
	}

	public void create (Customer customer) {
		customerDAO.save(customer);
	}

	public void update (Customer customer) {
		customerDAO.save(customer);
	}

	public void delete (Customer customer) {
		customerDAO.delete(customer);
	}

}
