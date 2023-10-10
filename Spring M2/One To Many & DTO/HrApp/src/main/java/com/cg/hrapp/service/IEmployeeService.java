package com.cg.hrapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Insurance;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.entity.Verification;

@Service
public interface IEmployeeService {

	public int saveEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	       ///            get<Entity>By<Property-Name>
	public List<Employee> getEmployeeByDesignation(String designation);
	public List<Employee> getEmployeeByLocation(String location);
	
	
	public Employee updateEmployee(int searchId,int newSalary);
	
	public String addVerificationDetails(int searchId,Verification verification);
	
	public Employee addInsuranceToEmployee(int searchId,int insurancecode);
	
	
	public Project getProjectByEmployeeId(int empId);
	
}















