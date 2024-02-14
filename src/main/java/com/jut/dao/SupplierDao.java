package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.jut.entity.Supplier;

@Repository
public class SupplierDao {
	@Autowired
	JdbcTemplate template;
	

	public boolean login(String user, String password) {
		//Object [] args={user,password};
		//System.out.println(user);
		Integer r=template.queryForObject("select count(*) from login where username=? and password=?",Integer.class,user,password);
		System.out.println(r);
		
		if(r==1){
			
			return true;
		}
		else{
			return false;
		}
		
	}


	public void Suppliers(Supplier s) {
		Object [] args={s.getSupplierId(),s.getSupplierName(),s.getContactNumber(),s.getAddress()};
		int a=template.update("insert into supplier values(?,?,?,?)",args);
		System.out.println(a);
		
		
	}

	
	public List<Supplier> Allsupplier() {
		try {
			List<Supplier> s=template.query("select* from supplier ",new RowMapper<Supplier>(){

				public Supplier mapRow(ResultSet rs, int arg1) throws SQLException {
					
					return  new Supplier(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				}
				
			});
			return s;

		
		
			} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	public void supplierupdate(Supplier s) {
		Object [] arg={s.getSupplierName(),s.getContactNumber(),s.getAddress(),s.getSupplierId()};
		int a=template.update("update  supplier set supplierName=?,contactNumber=?,address=? where supplierId=? ",arg);
		System.out.println(a);
	}


}
