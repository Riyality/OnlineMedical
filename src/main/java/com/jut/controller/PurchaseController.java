package com.jut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.jut.service.MedicineService;
import com.jut.service.PurchaseService;
import com.jut.service.SupplierService;


@Controller
public class PurchaseController {
	
	@Autowired
	PurchaseService purchaseService;
	
	@Autowired
	SupplierService supplierService;
	
	@Autowired
	MedicineService medicineService;
	
	@RequestMapping("purchase")
	public String customer(){
		return "purchase/add";
	
}
	
	public String getMadicineDetails(@PathVariable int medicineId,Model model){
		
		
		return null;
		
	}
	
}
	
	
	
