package edu.abc.hrpro.db;

import java.util.ArrayList;
import java.util.List;

import edu.abc.hrpro.model.Employee;

public class EmployeeDB {
	
	List<Employee> allEmployees = new ArrayList<>();
	
	public int insertEmployee(Employee e)
	{
		boolean status  = allEmployees.add(e); // insert SQL 
		
		return status?e.getId():-1;
		
	}
	
	public Employee getEmployeeById(int searchId)
	{
		return null;
	}
	
	public List<Employee> getAllEmployees()
	{
		return allEmployees;
	}

}
