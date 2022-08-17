package com.antra.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customerlock {
	
	@Id
	private Integer customerid;
	private String customername;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="lockerid_ref")
	private Locker locker;
	public Customerlock() {
		
	}

	public Customerlock(Integer customerid, String customername) {
		super();
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

	public Locker getLocker() {
		return locker;
	}

	public void setLocker(Locker locker) {
		this.locker = locker;
	}

	@Override
	public String toString() {
		return "Customerlock [customerid=" + customerid + ", customername=" + customername + ", locker=" + locker + "]";
	}
	
	

}
