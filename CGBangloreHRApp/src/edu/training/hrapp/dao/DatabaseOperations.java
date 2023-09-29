package edu.training.hrapp.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.training.hrapp.models.Employee;
import edu.training.hrapp.models.Project;

public class DatabaseOperations {

	public static Session hibernateSession ;
	
	public DatabaseOperations() {
		hibernateSession = MyHibernateConfiguration.hibernateSession;
	}
	
	public void allocateEmployeestoProject(int pid,Set<Employee> allEmployees)
	{
		Transaction t = hibernateSession.beginTransaction();
		Project savedProject = getProjectById(pid);
		savedProject.setAllEmployees(allEmployees); // execute update query in the db
		
		t.commit();
	}
	
	
	public Project getProjectById(int pid)
	{
		Project savedProject =(Project) hibernateSession.get(Project.class, pid);
		return savedProject;
		
	}	
	
	public void saveProject(Project p)
	{
		if(p != null)
		{
			Transaction t = hibernateSession.beginTransaction();
			hibernateSession.save(p);
			t.commit();
		}
	}
	public Employee getEmployeeById(long empId)
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
