package com.antra.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.antra.entitytwo.Author;

@Entity
public class Book {
	
	@Id
	private Integer bookid;
	private String bookname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Book_Author",joinColumns = @JoinColumn(name="book_ref"),
	inverseJoinColumns = @JoinColumn(name="author_ref"))
	
	private List<Author> author;

	public Book(Integer bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}

}
