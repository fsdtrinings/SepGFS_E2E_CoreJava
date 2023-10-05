package com.cg.hrapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;

@Service
public interface IEmployeeService {

	public int saveEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	       ///            get<Entity>By<Property-Name>
	public List<Employee> getEmployeeByDesignation(String designation);
	public List<Employee> getEmployeeByLocation(String location);
	
	
	public Employee updateEmployee(int searchId,int newSalary);
}
