package com.surya.spring.dao;

import java.util.List;

import com.surya.spring.model.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer cust);
	public void UpdateCustomer(Customer cust);
	public List<Customer> ListCustomers();
	public Customer fetchCustomerByid(int id);
	public void deleteCustomer(int id);
	
	
}
