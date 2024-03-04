package com.jut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	 LoginDao loginDao;
	
	public boolean login(String user, String password) {

		return loginDao.login(user, password);

	}

}
