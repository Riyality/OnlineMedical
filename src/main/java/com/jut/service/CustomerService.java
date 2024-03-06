package com.jut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.CustomerDao;
import com.jut.entity.Customer;


@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public void add(Customer customer) {
		customerDao.add(customer);
	}

	public List<Customer> list() {
		
		return customerDao.list();
	}

	public void update(Customer customer) {
		customerDao.update(customer);
		
	}

	public void delete(int customerId) {
		
		customerDao.delete(customerId);
		
	}

}
