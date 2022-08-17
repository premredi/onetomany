package com.antra.onetomany.Main;

import java.util.ArrayList;
import java.util.List;

import com.antra.dao.Customerdao;
import com.antra.entity.Customer;
import com.antra.entitytwo.Loan;
import com.antra.impl.Customerimpl;

public class Testmain {
	public static void main(String[] args) {
		Customerdao dao=new Customerimpl();
		
		List<Loan> l=new ArrayList<>();
		Loan l1=new Loan(1221,"home loan",400929.9);
		Loan l2=new Loan(1222,"Education loan",21222.9);
	    Loan l3=new Loan(1223,"vehicle loan",10000.7);	
	
		l.add(l1);
		l.add(l2);
		l.add(l3);
		
		Customer c1=new Customer(102,"mike");
		c1.setLoan(l);
		
		/* if(dao.savedetails(c1)) {
			System.out.println("details are inserted");
		}
		else {
			System.out.println("details are failed");
		}  */
	//	Customer customer= dao.fetchdetails(102);
		// System.out.println("view details");
		 // System.out.println(customer);
		 
		// dao.delete(102);
		 // System.out.println("details are deleted");
		
		
	//	lo.setLoantype("agriculture loan");
		dao.update(l1);
		System.out.println("details are updated");
		
	}
	

}
