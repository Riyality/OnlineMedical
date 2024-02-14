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
import com.jut.service.LoginService;
import com.jut.service.MedicineService;
import com.sun.org.apache.regexp.internal.REDebugCompiler;

@Controller
public class LoginController {
	@Autowired
	LoginService login;
	
	@RequestMapping("/")
	public String login(){
		return "login";
		
	}
	
	@RequestMapping(value="/login")
	public String Login(@RequestParam("username") String user,@RequestParam("password") String password){
		
			boolean b=login.login(user,password);
			if(b==true)
			{
				return "index";
			}
			else{
				return "login";
			}
	
}
	

	@RequestMapping("index")
	public String index(){
		return "index";
	}
}