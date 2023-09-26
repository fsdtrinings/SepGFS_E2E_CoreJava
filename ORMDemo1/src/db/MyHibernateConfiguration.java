package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MyHibernateConfiguration {

	public static Configuration cfg ;
	public static SessionFactory factory;
	public static Session hibernate ;
	
	static {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		hibernate = factory.openSession();
	}
}
