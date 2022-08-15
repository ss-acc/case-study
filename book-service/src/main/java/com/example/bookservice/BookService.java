package com.example.bookservice;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "books")
public class BookService {
	
	@Id
	private String bookid;
	
	private String bookname;
	
	private String author;
	
	private int availablecopies;
	
	private int totalcopies;
	
 
	public BookService(){
		
	}
	
	public BookService(String bookid, String bookname, String author, int availablecopies, int totalcopies) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.availablecopies = availablecopies;
		this.totalcopies = totalcopies;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getAvailablecopies() {
		return availablecopies;
	}

	public void setAvailablecopies(int availablecopies) {
		this.availablecopies = availablecopies;
	}

	public int getTotalcopies() {
		return totalcopies;
	}

	public void setTotalcopies(int totalcopies) {
		this.totalcopies = totalcopies;
	}

   	
    
}
