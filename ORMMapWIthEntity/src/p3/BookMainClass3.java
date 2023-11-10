package p3;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateConfiguration;

class A
{
	public static class B<T,Y>
	{
		
	}
}



public class BookMainClass3 {

	public static void main(String[] args) {
	  
		
		
		
	  // Step 1 :Get Hibernate
	  Session hibernate = MyHibernateConfiguration.conhibernate;
	  
	  
	  BookOrder bookOrder = (BookOrder)hibernate.get(BookOrder.class, 101);
	  
	  System.out.println(bookOrder);
	  Map<Book, Integer> orderMap = bookOrder.getOrderDetails();
	  for (Map.Entry<Book, Integer>  entry: orderMap.entrySet()) {
		  System.out.println(entry.getKey().getBookName()+" "+entry.getValue());
	  }
	  hibernate.close(); 
	 
	}
}
