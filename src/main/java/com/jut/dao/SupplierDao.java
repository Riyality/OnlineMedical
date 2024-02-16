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
	
	public void add(Supplier supplier) {
		Object [] argument = {supplier.getSupplierId(),supplier.getSupplierName(),supplier.getContactNumber(),supplier.getAddress()};
		int a=template.update("insert into supplier values(?,?,?,?)",argument);
		System.out.println(a);
			
	}

	public List<Supplier> list() {
		try {
			List<Supplier> supplier = template.query("select* from supplier ",new RowMapper<Supplier>(){

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

	public void supplierupdate(Supplier supplier) {
		
		Object [] argument = {supplier.getSupplierName(),supplier.getContactNumber(),supplier.getAddress(),supplier.getSupplierId()};
		int a = template.update("update  supplier set supplierName=?,contactNumber=?,address=? where supplierId=? ",argument);
		System.out.println(a);
	}


}
