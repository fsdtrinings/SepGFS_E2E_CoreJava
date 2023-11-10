package p3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookNo;
	private String bookName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}


	public Book(int bookNo, String bookName) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
	}

	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
