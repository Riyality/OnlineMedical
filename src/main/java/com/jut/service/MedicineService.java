package com.jut.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
/*
	public void medicineupdate(Medicine medicine) {
		medicineDao.medicineupdate(medicine);
	}

	*/

	public void update(Medicine medicine) {
		medicineDao.update(medicine);
		
	}

	
}
