package com.jut.entity;

import java.util.Date;

public class Medicine {
	private int medicineId;
	private String medicineName;
	private String rate;
	private String manufacturer;
	private String expiryDate;
	
	
	public Medicine(int medicineId, String medicineName, String rate, String manufacturer, String expiryDate) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.rate = rate;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
	}
	
	
	public Medicine() {
		super();
		
	}
	
	
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	

	
	

}