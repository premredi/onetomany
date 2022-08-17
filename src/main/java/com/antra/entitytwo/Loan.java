package com.antra.entitytwo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {
	
	@Id
	private Integer loanid;
	private String loantype;
	private double amount;
	private Integer customerid_ref;
	
	public Loan() {
		
	}
	public Loan(Integer loanid, String loantype, double amount) {
		
		this.loanid = loanid;
		this.loantype = loantype;
		this.amount = amount;
	}
	public Integer getLoanid() {
		return loanid;
	}
	public void setLoanid(Integer loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loantype=" + loantype + ", amount=" + amount + ",customerid_ref=" + customerid_ref + "]";
	}
	

}
