package com.antra.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.antra.dao.Customerdao;
import com.antra.entity.Customer;
import com.antra.entitytwo.Loan;


public class Customerimpl implements Customerdao{
	
	static SessionFactory factory;
	static {
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		factory= cfg.buildSessionFactory();
	}

	@Override
	public boolean savedetails(Customer c) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		try {
			session.save(c);
			t.commit();
			return true;
		}
		catch(Exception e) {
			t.rollback();
			return false;
		}
		finally {
			session.close();
		}
	}

	@Override
	public void delete(Integer id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Customer c= session.get(Customer.class, id);
		try {
			session.delete(c);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			
		}
	}

	@Override
	public Customer fetchdetails(Integer id) {
		Session session=factory.openSession();
		Customer c2=session.get(Customer.class, id);
		
		return c2;
	}

	@Override
	public void update(Loan l1) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		try {
			session.update(l1);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		
	}

}
