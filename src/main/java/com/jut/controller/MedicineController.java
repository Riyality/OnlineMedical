package com.jut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jut.entity.Medicine;
import com.jut.service.MedicineService;
@Controller
public class MedicineController {
	
	@Autowired
	MedicineService medicine;
	
	@RequestMapping("medicine")
	public String medicine(){
		return "medicine/add";
		
	}
	@RequestMapping("/Medicine")
	public String medicine(@ModelAttribute Medicine m){
		medicine.medicine(m);
		return "medicine/add";
		
	}
	@RequestMapping("/allmedi")
	public String medicine( Model model){
		List<Medicine> list1=medicine.Allmedicine();
		model.addAttribute("MedicineList", list1);
		
		
		return "medicine/list";
	}	
	
	
}
