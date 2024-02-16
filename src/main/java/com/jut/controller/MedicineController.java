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
	MedicineService medicineService;
	
	@RequestMapping("medicine")
	public String medicine(){
		return "medicine/add";
		
	}
	@RequestMapping("/Medicine")
	public String add(@ModelAttribute Medicine medicine){
		medicineService.add(medicine);
		return "medicine/add";
		
	}
	@RequestMapping("/allmedi")
	public String list( Model model){
		List<Medicine> list1=medicineService.list();
		model.addAttribute("MedicineList", list1);
		
		
		return "medicine/list";
	}	

	/*@RequestMapping("/update")
	public String medicineupdate(@ModelAttribute Medicine medicine, Model model){
		
		medicineService.medicineupdate(medicine);
		
		
		return "medicine/list";
		
	}*/
	@RequestMapping("/updates")
	public String update(@ModelAttribute Medicine medicine,Model model){
		medicineService.update(medicine);
		return "medicine/list";
	}
	
	
}
