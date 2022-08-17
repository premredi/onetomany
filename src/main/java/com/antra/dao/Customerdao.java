package com.antra.dao;

import com.antra.entity.Customer;
import com.antra.entitytwo.Loan;

public interface Customerdao {
	
	boolean savedetails(Customer c);
	public void delete(Integer id);
	
	Customer fetchdetails(Integer id);
	
	public void update(Loan l1);

}
