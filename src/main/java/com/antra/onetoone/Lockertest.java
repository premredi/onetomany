package com.antra.onetoone;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lockertest {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Locker l=new Locker(3333,7.5,2);
		Customerlock lock=new Customerlock(7979,"ross");
		
		 lock.setLocker(l);
	//	 session.save(lock);
		// t.commit();
		System.out.println("details are inserted"); 
		
		String hql="  from Customerlock c where c.customername = :name";
		Query q=session.createQuery(hql);
		 q.setParameter("name", "prem");
		 List list=((org.hibernate.query.Query) q).list();
		
		System.out.println(list); 
		
	//	Customerlock l1=session.get(Customerlock.class, 7979);
	//	session.delete(l1);
		// t.commit();
	//	System.out.println("details are deleted");
		
		
		Locker lo=session.get(Locker.class, 2345);
		lo.setRent(2.45);
		session.update(lo);
		t.commit();
		
	

	}

}
