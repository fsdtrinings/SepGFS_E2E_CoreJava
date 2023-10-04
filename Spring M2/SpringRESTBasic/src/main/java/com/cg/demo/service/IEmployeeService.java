package com.cg.demo.service;

import java.util.List;

import com.cg.demo.entity.Employee;

public interface IEmployeeService {

	public String saveEmployee(Employee e);
	public Employee getEmployeeById(int searchId);
	public List<Employee> getAllEmployee();
	public List<Employee> getAllEmployee(String searchLocation);
	
	
}
