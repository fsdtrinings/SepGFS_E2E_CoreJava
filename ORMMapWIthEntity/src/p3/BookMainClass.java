package p3;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateConfiguration;




public class BookMainClass {

	public static void main(String[] args) {
	  
	  // Step 1 :Get Hibernate
	  Session hibernate = MyHibernateConfiguration.conhibernate;
	  
	  // step 2 : generate data 
	 
	  Book b1 = new Book("Java");
	  Book b2 = new Book("Python");
	  Book b3 = new Book("Spring");
	  Book b4 = new Book("Finance");
	  
	  
	  
	  
	  
	  // step3 : perform DB operation 
	  Transaction t = hibernate.beginTransaction();
	  hibernate.save(b1);
	  hibernate.save(b2);
	  hibernate.save(b3);
	  hibernate.save(b4);
	  	
	  t.commit();
	  
	  // Step 4 : Close connection (ie, disconnecting phone) 
	  hibernate.close(); 
	 
	}
}
