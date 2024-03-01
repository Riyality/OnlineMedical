package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jut.entity.Customer;
import com.jut.entity.Supplier;
@Repository
public class CustomerDao {
	@Autowired
	JdbcTemplate JdbcTemplate;
	

	
	
	public void addcustomer(Customer customer) {
		Object [] argument={customer.getCustomerId(),customer.getCustomerName(),customer.getContactNumber()};
		int result=JdbcTemplate.update("insert into customer values(?,?,?)",argument);
		System.out.println(result);
		
		
	}




	public List<Customer> CustomerList() {
		try {
			List<Customer> customer=JdbcTemplate.query("select* from customer ",new RowMapper<Customer>(){

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
		int result = JdbcTemplate.update("update  customer set CustomerName=?,ContactNumber=? where CustomerId=? ",argument);
		System.out.println(result);
		
	}




	public boolean delete(int CustomerId) {
		try {

			Object[] args = {CustomerId};
			int data = JdbcTemplate.update("delete from customer where CustomerId=?", args);
			 
			 if(data==1){
				 return true;
			 }	

		} catch (Exception e2) {
         System.out.println(e2);
		}
		return false;
		
	}
	


	
	
	

}


