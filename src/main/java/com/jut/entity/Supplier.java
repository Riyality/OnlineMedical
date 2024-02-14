package com.jut.entity;

public class Supplier {
	
	private int SupplierId;
	private String SupplierName;
	private String ContactNumber;
	private String Address;

	public Supplier(){}

	public Supplier(int supplierId, String supplierName, String contactNumber, String address) {
		super();
		SupplierId = supplierId;
		SupplierName = supplierName;
		ContactNumber = contactNumber;
		Address = address;
	}

	public int getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}

	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
