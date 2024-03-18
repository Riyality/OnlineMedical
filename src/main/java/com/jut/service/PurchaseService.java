package com.jut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.PurchaseDao;

@Service
public class PurchaseService {
	@Autowired
	PurchaseDao purchaseDao;
 
}
