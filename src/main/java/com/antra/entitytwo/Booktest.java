package com.antra.entitytwo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.antra.entity.Book;

public class Booktest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		
		Book b=new Book(1111,"harry porter");
		Book b1=new Book(2222,"vampire dairies");
		
		List<Author> author=new ArrayList<>();
		Author a=new Author(9009,"ryan");
		Author a1=new Author(8008,"tom");
		
		author.add(a1);
		author.add(a);
		
		b1.setAuthor(author);
		
		session.save(b1);
		t.commit();
		System.out.println("details are saved");
		
		Author auth=session.get(Author.class, 9009);
		session.delete(auth);
		t.commit();
		
		Book bk=session.get(Book.class, 1111);
		bk.setBookname("stranger things");
		session.update(bk);
		t.commit(); 
		 
	}

}
