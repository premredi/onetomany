package com.antra.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.antra.entitytwo.Loan;

@Entity

public class Customer {
	@Id
	private Integer customerid;
	private String customername;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="customerid_ref")
	private List<Loan> loan;
	public List<Loan> getLoan() {
		return loan;
	}
	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	public Customer() {
		
	}
	public Customer(Integer customerid, String customername) {
		
		this.customerid = customerid;
		this.customername = customername;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", loan=" + loan + "]";
	}
	

}
