package com.jut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jut.entity.Supplier;
import com.jut.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	SupplierService supplier;
	
	
	@RequestMapping("Supplier")
	public String supplier(){
		return "Supplier";
	}
	
	
	@RequestMapping("/supplier")
	public String Suppliers(@ModelAttribute Supplier s){
		
		supplier. Suppliers(s);
		
		return "Supplier";
	}
	
	@RequestMapping("/allsuppliers")
	public String Allsupplier( Model model){
		List<Supplier> list1=supplier.Allsupplier();
		model.addAttribute("supplierList", list1);
		
		
		return "AllSuppliers";
		
	}
	
	@RequestMapping("/update")
	public String supplierupdate(@ModelAttribute Supplier s, Model m){
		
		supplier.supplierupdate(s);
		
		
		return "AllSuppliers";
		
	}
	
}
