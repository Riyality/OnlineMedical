package com.jut.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/allmedicine")
	public String list( Model model){
		List<Medicine> list1=medicineService.list();
		model.addAttribute("MedicineList", list1);
		
		
		return "medicine/list";
	}	


	/*@RequestMapping("/updates")
	public String update(@ModelAttribute Medicine medicine,Model model){
		medicineService.update(medicine);
		return "medicine/update";
	}*/
	@RequestMapping("updatemedicine")
	public String update(){
		return "medicine/update";
	}
	
	@RequestMapping(value="/editmedicine",method=RequestMethod.POST)
	public String update(@ModelAttribute Medicine medicine,Model model){
		boolean isAdded=medicineService.update(medicine);
		if(isAdded){
			model.addAttribute("msg","update succesfully");
		}else
		{
			model.addAttribute("error","not succesfully");
			
		}
		return "redirect:/allmedicine";
	}
	
	@RequestMapping("/deletes")
	public String delete(@RequestParam int medicineId, Model model){
		medicineService.delete(medicineId);
		return "redirect:/allmedicine";
	}
}
