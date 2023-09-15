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
	
	public List<Employee> getEmployeeByDepartment(String searchDepartment)
	{
		List<Employee> tempList = new ArrayList<>();
		for (Employee employee : allEmployees) {
			if(employee.getDepartment().equals(searchDepartment))
			{
				tempList.add(employee);
			}
		}
		
		return tempList;
	}
	
	
	public List<Employee> getEmployeeBySalaryRange(int r1,int r2)
	{
		List<Employee> tempList = new ArrayList<>();
		for (Employee employee : allEmployees) {
			if(employee.getSalary()>=r1 && employee.getSalary()<=r2)
			{
				tempList.add(employee);
			}
		}
		
		return tempList;
	}
	
	
	
	
	
	public Employee getEmployeeById(int searchId)
	{
		
		for (Employee employee : allEmployees) {
			if(employee.getId() == searchId)
			{
				return employee;
			}
		}
		
		return null;
	}
	
	public List<Employee> getAllEmployees()
	{
		return allEmployees;
	}

}
