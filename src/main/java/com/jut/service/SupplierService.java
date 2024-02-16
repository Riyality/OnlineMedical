package com.jut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.SupplierDao;
import com.jut.entity.Supplier;

@Service
public class SupplierService {
	@Autowired
	SupplierDao supplierDao;
	
	public void add(Supplier supplier) {
		supplierDao.add(supplier);
	}

	public List<Supplier> list() {
		
		return supplierDao.list();
	}

	public void supplierupdate(Supplier supplier) {
		supplierDao.supplierupdate(supplier);
		
	}
}
