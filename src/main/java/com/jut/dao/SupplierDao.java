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


	public void add(Supplier supplier) {
		Object [] argument={supplier.getSupplierId(),supplier.getSupplierName(),supplier.getContactNumber(),supplier.getAddress()};
		int a=template.update("insert into supplier values(?,?,?,?)",argument);
		System.out.println(a);
		
		
	}

	
	public List<Supplier> list() {
		try {
			List<Supplier> supplier=template.query("select* from supplier ",new RowMapper<Supplier>(){

				public Supplier mapRow(ResultSet rs, int arg1) throws SQLException {
					
					return  new Supplier(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				}
				
			});
			return supplier;

		
		
			} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}


	public boolean update(Supplier supplier) {
		try{
		Object [] argument={supplier.getSupplierId(),supplier.getSupplierName(),supplier.getContactNumber(),supplier.getAddress()};
		int result=template.update("update  supplier set SupplierName=?,ContactNumber=?,Address=? where SupplierId=? ",argument);
		System.out.println(result);
		
		if(result==1){
			return true;
		}
		
		
		}catch(Exception e){
		e.printStackTrace();
		
		}
		return false;
		
		

		
	}



public boolean delete(int supplierId){
	try{
		Object[] args={supplierId};
		int result=template.update("delete from  supplier  where SupplierId=?",args);
		if(result==1){
			return true;
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return false;
}
}