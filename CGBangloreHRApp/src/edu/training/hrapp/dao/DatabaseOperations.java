package edu.training.hrapp.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.training.hrapp.models.Employee;

public class DatabaseOperations {

	public static Session hibernateSession ;
	
	public DatabaseOperations() {
		hibernateSession = MyHibernateConfiguration.hibernateSession;
	}
	
	
	public Employee getEmployeeById(int empId)
	{
		Employee savedEmp = (Employee) hibernateSession.get(Employee.class, empId);
		return savedEmp;
	}	
	public void saveEmployee(Employee e)
	{
		if(e != null)
		{
			Transaction t = hibernateSession.beginTransaction();
			hibernateSession.save(e);
			t.commit();
		}
	}
}
