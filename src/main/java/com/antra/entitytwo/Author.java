package com.antra.entitytwo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private Integer authorid;
	
	private String authorname;

	public Author(Integer authorid, String authorname) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
	}

	public Integer getAuthorid() {
		return authorid;
	}

	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + "]";
	}
	

}
