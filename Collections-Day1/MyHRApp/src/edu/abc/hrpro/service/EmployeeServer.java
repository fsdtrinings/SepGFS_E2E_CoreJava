package edu.abc.hrpro.service;

import java.util.List;

import edu.abc.hrpro.db.EmployeeDB;
import edu.abc.hrpro.model.Employee;

public class EmployeeServer {
	
	private EmployeeDB db;
	
	public EmployeeServer() {
		db = new EmployeeDB();
		// database connection code
	}
	
	public String insertEmployee(Employee e)
	{
		int fromDBId = db.insertEmployee(e);
		if(fromDBId != -1)
		{
			return " New Employee Id "+fromDBId;
		}
		else 
		{
			return "ERROR !!! Contact to Customer Service";
		}
		 
	}
	
	public Employee getEmployeeById(int searchId)
	{
		return db.getEmployeeById(searchId);
	}
	
	public List<Employee> getAllEmployees()
	{
		return db.getAllEmployees();
	}


	public List<Employee> getEmployeeByDepartment(String searchDepartment)
	{
		/*
		 * some auth.. 
		 * DTO convertor
		 * */
		return db.getEmployeeByDepartment(searchDepartment);
		
	}
	
	
	public List<Employee> getEmployeeBySalaryRange(int r1,int r2)
	{
		return db.getEmployeeBySalaryRange(r1, r2);
	}
	
}




















