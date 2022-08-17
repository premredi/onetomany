package com.antra.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locker {
	@Id
	private Integer lockid;
	private double rent;
	private Integer tenure;
	
	public Locker() {
		
	}
	public Locker(Integer lockid, double rent, Integer tenure) {
		super();
		this.lockid = lockid;
		this.rent = rent;
		this.tenure = tenure;
	}
	public Integer getLockid() {
		return lockid;
	}
	public void setLockid(Integer lockid) {
		this.lockid = lockid;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	@Override
	public String toString() {
		return "Locker [lockid=" + lockid + ", rent=" + rent + ", tenure=" + tenure + "]";
	}
	
	
	

}
