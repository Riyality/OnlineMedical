package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jut.entity.Medicine;



@Repository
public class MedicineDao {
	@Autowired
	
	JdbcTemplate template;

	public void add(Medicine medicine) {
	Object [] argument = { medicine.getMedicineId(),medicine.getMedicineName(),medicine.getRate(),medicine.getManufacturer(),medicine.getExpiryDate() };
	int a = template.update("insert into medicine values(?,?,?,?,?)",argument);
	System.out.println(a);
	}

	public List<Medicine> list() {
		try {
			List<Medicine> medicine = template.query("select* from medicine ",new RowMapper<Medicine>(){

				public Medicine mapRow(ResultSet rs, int argument) throws SQLException {
					
					return  new Medicine(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				}
				
			});
			return medicine;
		
		
			} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public void update(Medicine medicine) {
		Object [] argument = {medicine.getMedicineName(),medicine.getRate(),medicine.getManufacturer(),medicine.getExpiryDate(),medicine.getMedicineId()};
		int a = template.update("update medicine set medicineName=?,rate=?,manufacturer=?,expiryDate=? where medicineId=? ",argument);
		System.out.println(a);
	}

	
	/*public void medicineupdate(Medicine medicine) {
		Object [] argument = {medicine.getMedicineName(),medicine.getRate(),medicine.getManufacturer(),medicine.getExpiryDate(),medicine.getMedicineId()};
		int a = template.update("update  medicine set medicinename=?,rate=?,Manufacturer=?,ExpiryDate=? where MedicineId=? ",argument);
		System.out.println(a);
		
	}
*/

}
