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
	CustomerService customerService;
	
	@RequestMapping("customers")
	public String customer(){
		return "customer/add";
	}
	
	
	@RequestMapping("/customer")
	public String add(@ModelAttribute Customer customer){
		
		customerService. add(customer);
		
		return "redirect:/allCustomer";
	}
	
	@RequestMapping("/allCustomer")
	public String list( Model model){
		List<Customer> list1=customerService.list();
		model.addAttribute("customerList", list1);
		
		
		return "customer/list";
		
	}
	
	@RequestMapping("updatesCustomer")
	public String update(){
		return "customer/update";
	}
	
	
	@RequestMapping("/edits")
	public String update(@ModelAttribute Customer customer, Model model){
		
		customerService.update(customer);
		
		
		return "redirect:/allCustomer";
		
	}
	

	@RequestMapping("/customer-delete")
	public String delete(@RequestParam int customerId){
		
		customerService.delete(customerId);
		
		
		return "redirect:/allCustomer";
		
	}
}
