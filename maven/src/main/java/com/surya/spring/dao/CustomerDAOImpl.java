package com.surya.spring.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.surya.spring.model.Customer;



public class CustomerDAOImpl {

@Repository
public class CustomerDAOimpl implements CustomerDAO{
	
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sf) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
	Session session=this.sessionfactory.getCurrentSession();
	session.persist(cust);
	}

	@Override
	public void UpdateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		session.update(cust);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Customer> ListCustomers() {
		// TODO Auto-generated method stub
		
		Session session=this.sessionfactory.getCurrentSession();
				List<Customer> custlist = session.createQuery("from Customer").list();
		return custlist;
	}

	@Override
	public Customer fetchCustomerByid(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		Customer cust=(Customer)session.load(Customer.class, id);
		return cust;
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionfactory.getCurrentSession();
		Customer cust=(Customer)session.load(Customer.class, id);
		if(cust!=null)
		{
			session.delete(cust);
		}
		
	}
	
	

}
}