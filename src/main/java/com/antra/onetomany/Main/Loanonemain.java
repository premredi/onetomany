package com.antra.onetomany.Main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.antra.entity.Customerone;
import com.antra.entitytwo.Loanone;

public class Loanonemain {

	public static void main(String[] args) {
		Customerone c=new Customerone(1907,"vikram");
		
		Loanone l=new Loanone(1004,"edcation loan",350000.9);
		Loanone l1=new Loanone(1002,"agricultural loan",7890000.78);
		Loanone l2=new Loanone(1005,"vechile loan",980000.78);

		l2.setCt(c);
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session =factory.openSession();
		Transaction t=session.beginTransaction();
		
	//	session.save(l2);
		// t.commit();
		
	//	System.out.println("details are saved");
		
	     
		Loanone loan=session.get(Loanone.class,1005);
		session.delete(loan);
		t.commit();
		System.out.println("details are detailed");
		
		Loanone ln=session.get(Loanone.class, 1002);
		ln.setLoantype("home loan");
		session.update(ln);
		t.commit();
		
		
		String hql ="from Loanone ";
		Query q=session.createQuery(hql);
		List list=((org.hibernate.query.Query) q).list();
		System.out.println(list);
	}

}
