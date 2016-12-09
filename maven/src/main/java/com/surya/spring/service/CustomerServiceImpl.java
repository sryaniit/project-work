/*package com.surya.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surya.spring.dao.CustomerDAO;
import com.surya.spring.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	@Override
	@Transactional
	public void addCustomer(Customer cust){
		this.customerDAO.addCustomer(cust);
	}
	@Override
	@Transactional
	public void UpdateCustomer(Customer cust){
		this.customerDAO.UpdateCustomer(cust);
	}
	
	@Override
	@Transactional
	public List<Customer> ListCustomers(){
		return this.customerDAO.ListCustomers();
	}
	
	@Transactional
	@Override
	public void deleteCustomer(int id){
		
	this.customerDAO.deleteCustomer(id);
	}
	@Override
	@Transactional
	public Customer fetchCustomerByid(int id){
		return this.customerDAO.fetchCustomerByid(id);
	}
	
	
}
*/