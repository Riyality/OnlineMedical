package com.jut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jut.dao.MedicineDao;
import com.jut.entity.Medicine;

@Service
public class MedicineService {
	@Autowired
	MedicineDao md;

	public void medicine(Medicine m) {
		md.medicine(m);

	}

	public List<Medicine> Allmedicine() {
		
		return md.Allmedicine();
	}

	
	

}
