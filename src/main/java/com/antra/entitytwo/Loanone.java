package com.antra.entitytwo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.antra.entity.Customerone;

@Entity
public class Loanone {
	
	@Id
	private Integer loanno;
	
	private String loantype;
	 private double cash;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="customerid_ref")

	 Customerone ct;
	 public Loanone() {
		 
	 }

	public Loanone(Integer loanno, String loantype, double cash) {
		
		this.loanno = loanno;
		this.loantype = loantype;
		this.cash = cash;
		
	}

	public Integer getLoanno() {
		return loanno;
	}

	public void setLoanno(Integer loanno) {
		this.loanno = loanno;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public Customerone getCt() {
		return ct;
	}

	public void setCt(Customerone ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Loanone [loanno=" + loanno + ", loantype=" + loantype + ", cash=" + cash + ", ct=" + ct + "]";
	}
	 
	 

}
