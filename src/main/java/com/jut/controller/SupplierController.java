package com.jut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.jut.entity.Supplier;
import com.jut.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	
	
	@RequestMapping("Supplier")
	public String supplier(){
		return "supplier/add";
	}
	
	
	@RequestMapping("/supplier")
	public String add(@ModelAttribute Supplier supplier){
		
		supplierService. add(supplier);
		
		return "redirect:/allsuppliers";
	}
	
	@RequestMapping("/allsuppliers")
	public String list( Model model){
		List<Supplier> list1=supplierService.list();
		model.addAttribute("supplierList", list1);
		
		
		return "supplier/list";
		
	}
	
	
	@RequestMapping("update")
	public String update(){
		return "supplier/list";
	}
	
	@RequestMapping("/Update")
	public String update(@ModelAttribute Supplier supplier, Model model){
		
	boolean isAdded=supplierService.update(supplier);
	
	return "redirect:/allsuppliers";

	}
	
	
	@RequestMapping("/DeleteSupplier")
		public String Delete(@RequestParam int supplierId, Model model ){
			boolean isDeleted=supplierService.delete(supplierId);
			if(isDeleted){
				model.addAttribute("successMsg","Supplier deleted Successfully");
			}
			else{
				model.addAttribute("errorMsg","Supplier deleted Successfully");
			}
			return "redirect:/allsuppliers";
			
			/*return "supplier/list";*/

		}
	}


	

