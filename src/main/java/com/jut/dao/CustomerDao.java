package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jut.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	JdbcTemplate template;
	
	public void add(Customer customer) {
		Object [] argument = {customer.getCustomerId(),customer.getCustomerName(),customer.getContactNumber()};
		int result = template.update("insert into customer values(?,?,?)",argument);
		System.out.println(result);
			
	}

	public List<Customer> list() {
		try {
			List<Customer> customer = template.query("select* from customer ",new RowMapper<Customer>(){

				public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
					
					return  new Customer(rs.getInt(1),rs.getString(2),rs.getString(3));
				}
				
			});
			return customer;

			} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	public void update(Customer customer) {
		
		Object [] argument = {customer.getCustomerName(),customer.getContactNumber(),customer.getCustomerId()};
		int result = template.update("update  customer set CustomerName=?,contactNumber=? where customerId=? ",argument);
		System.out.println(result);
	}


	public boolean delete(int customerId) {
try{
		Object [] argument = {customerId};
		int a=template.update("delete from customer where customerId=?", argument);
		if(a==1){
		return true;
		}
}catch(Exception e){
	
}
		return false;
	}



}
