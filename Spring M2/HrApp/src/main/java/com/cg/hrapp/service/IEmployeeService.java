package com.cg.hrapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;

@Service
public interface IEmployeeService {

	public int saveEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	
}
