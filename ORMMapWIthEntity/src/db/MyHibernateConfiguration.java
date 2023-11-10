package db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class MyHibernateConfiguration {

	public static Configuration cfg ;
	public static SessionFactory factory;
	public static Session conhibernate ;
	
	static {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		conhibernate = factory.openSession();
	}
	
	
}
