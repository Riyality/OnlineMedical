package com.jut.entity;

public class Customer {
	
private int CustomerId;
private String CustomerName;
private String ContactNumber;


public Customer() {
	super();
	
}


public Customer(int customerId, String customerName, String contactNumber) {
	super();
	CustomerId = customerId;
	CustomerName = customerName;
	ContactNumber = contactNumber;
}


public int getCustomerId() {
	return CustomerId;
}


public void setCustomerId(int customerId) {
	CustomerId = customerId;
}


public String getCustomerName() {
	return CustomerName;
}


public void setCustomerName(String customerName) {
	CustomerName = customerName;
}


public String getContactNumber() {
	return ContactNumber;
}


public void setContactNumber(String contactNumber) {
	ContactNumber = contactNumber;
}



}
