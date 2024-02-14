package com.jut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.SupplierDao;
import com.jut.entity.Supplier;

@Service
public class SupplierService {
	@Autowired
	SupplierDao supplierdao;
	
	public void Suppliers(Supplier s) {
		supplierdao.Suppliers(s);
	}

	public List<Supplier> Allsupplier() {
		
		return supplierdao.Allsupplier();
	}

	public void supplierupdate(Supplier s) {
		supplierdao.supplierupdate(s);
		
	}
}
