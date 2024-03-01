package com.jut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.CustomerDao;
import com.jut.entity.Customer;
import com.jut.entity.Supplier;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public void addCustomer(Customer customer) {
	customerDao.addcustomer(customer);
		
	}
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return customerDao.CustomerList();
	}
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}
	
	public boolean delete(int CustomerId) {
	return	customerDao.delete(CustomerId);

		
	}
	
	

	

	
}
