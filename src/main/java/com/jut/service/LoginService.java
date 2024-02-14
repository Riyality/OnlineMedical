package com.jut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	 LoginDao dao;
	
	public boolean login(String user, String password) {

		return dao.login(user, password);

	}

}
