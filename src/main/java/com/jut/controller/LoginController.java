package com.jut.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.jut.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService login;
	
	@RequestMapping("/")
	public String login(){
		return "login";
		
	}
	@RequestMapping("index")
	public String index(){
		return "index";
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
	
	
}