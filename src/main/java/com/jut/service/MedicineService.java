package com.jut.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.jut.dao.MedicineDao;
import com.jut.entity.Medicine;

@Service
public class MedicineService {
	@Autowired
	MedicineDao medicineDao;

	public void add(Medicine medicine) {
		medicineDao.add(medicine);

	}

	public List<Medicine> list() {
		
		return medicineDao.list();
	}

	

	public boolean update(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDao.update(medicine);
	}


public void delete(int medicineId) {
		
	medicineDao.delete(medicineId);
	}

	
	

	
}
