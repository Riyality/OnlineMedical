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
	
	public void add(Supplier supplier) {
		supplierdao.add(supplier);
	}

	public List<Supplier> list() {
		
		return supplierdao.list();
	}

	public boolean delete(int supplierId) {
		
		return supplierdao.delete( supplierId) ;
	}

	public boolean update(Supplier supplier) {
		
		return supplierdao.update(supplier);
	}


}
