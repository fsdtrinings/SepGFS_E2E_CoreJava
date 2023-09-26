package p2;

import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateConfiguration;
import p1.Policy;

public class MainClass {

	public static void main(String[] args) {

		// Step 1 : write some code , so that our application can read cfg file
		Session hibernate = MyHibernateConfiguration.hibernate;

		// step 2 : generate data
		Policy licPolicy = new Policy("LIC - Life Plan", 1500, 20500);

		// step3 : perform DB operation
		Transaction t = hibernate.beginTransaction();
		hibernate.save(licPolicy);
		t.commit();

		// Step 4 : Close connection (ie, disconnecting phone)
		hibernate.close();
	}
}
