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

	public void medicine(Medicine m) {
	Object [] arg = { m.getMedicineId(),m.getMedicineName(),m.getRate(),m.getManufacturer(),m.getExpiryDate() };
	int a = template.update("insert into medicine values(?,?,?,?,?)",arg);
	System.out.println(a);
	}

	public List<Medicine> Allmedicine() {
		try {
			List<Medicine> m=template.query("select* from medicine ",new RowMapper<Medicine>(){

				public Medicine mapRow(ResultSet rs, int arg1) throws SQLException {
					
					return  new Medicine(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				}
				
			});
			return m;
		
		
			} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


}
