package com.jut.entity;

import javax.persistence.Entity;

@Entity
public class Customer {
private int	CustomerId ;
private String	CustomerName ;
private String ContactNumber ;

public  Customer(){}

public Customer(int customerId, String customerName, String contactNumber) {
	super();
	 this.CustomerId = customerId;
	 this.CustomerName = customerName;
	 this.ContactNumber = contactNumber;
}

public int getCustomerId() {
	return CustomerId;
}

public void setCustomerId(int customerId) {
	this.CustomerId = customerId;
}

public String getCustomerName() {
	return CustomerName;
}

public void setCustomerName(String customerName) {
	this.CustomerName = customerName;
}

public String getContactNumber() {
	return ContactNumber;
}

public void setContactNumber(String contactNumber) {
	this.ContactNumber = contactNumber;
}




}


