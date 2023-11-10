package p3;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateConfiguration;




public class BookMainClass2 {

	public static void main(String[] args) {
	  
	  // Step 1 :Get Hibernate
	  Session hibernate = MyHibernateConfiguration.conhibernate;
	  
	  
	  Book fromDB1 = (Book)hibernate.get(Book.class, 1);
	  Book fromDB2 = (Book)hibernate.get(Book.class, 2);
	  Book fromDB3 = (Book)hibernate.get(Book.class, 3);
	  Book fromDB4 = (Book)hibernate.get(Book.class, 4);
	  
	  System.out.println(fromDB1.getBookName());
	  System.out.println(fromDB2.getBookName());
	  System.out.println(fromDB3.getBookName());
	  System.out.println(fromDB4.getBookName());
	  
	  
	  
	  
	  
	  Map<Book, Integer> rameshOrder = new HashMap<>();
	  rameshOrder.put(fromDB1, 2);
	  rameshOrder.put(fromDB2, 7);
	  rameshOrder.put(fromDB4, 2);
	  
	  Map<Book, Integer> sureshOrder = new HashMap<>();
	  sureshOrder.put(fromDB1, 2);
	  sureshOrder.put(fromDB3, 9);

	  
	  
	  
	  
	  
	  BookOrder order1 = new BookOrder(101, "Ramesh", rameshOrder);
	  BookOrder order2 = new BookOrder(102, "Suresh", sureshOrder);
	 
	  
	  
	  // step3 : perform DB operation 
	  Transaction t = hibernate.beginTransaction();
	  hibernate.save(order1);
	  hibernate.save(order2);
	  
	 
	  	
	  t.commit();
	  
	  // Step 4 : Close connection (ie, disconnecting phone) 
	  hibernate.close(); 
	 
	}
}
