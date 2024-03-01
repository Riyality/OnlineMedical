package com.jut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jut.entity.Customer;
import com.jut.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService  customerService;
	
	
	@RequestMapping("AddCustomer")
	public String AddCustomer(){
		return "customer/add";
		
	}
	
	@RequestMapping("/addCustomer")
	public String Customer(@ModelAttribute Customer customer){
		customerService.addCustomer(customer);
		
		/*return "customer/addCustomer";*/
		 return "redirect:/allCustomer";
	}
	
	@RequestMapping("/allCustomer")
	public String list( Model model){
		List<Customer> customerList=customerService.list();
		model.addAttribute("customerList", customerList);
		
		
		return "customer/list";
		
	}
	@RequestMapping("customerUpdate")
	public String update(){
		return "customer/update";
	}
	
	
	@RequestMapping("/edit")
	public String update(@ModelAttribute Customer customer, Model model){
		
		customerService.update(customer);
		
		
		return "redirect:/allCustomer";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int CustomerId, Model model) {
	    
	    boolean Customerdelete = customerService.delete(CustomerId);

	    if (Customerdelete) {
	        model.addAttribute("successMsg", "Customer deleted successfully...");
	    } else {
	        model.addAttribute("errMsg", "Unable to delete the Customer...");
	    }

	    return "redirect:/allCustomer";
	}
	

}
