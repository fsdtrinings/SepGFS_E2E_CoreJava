package com.cg.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.entity.Employee;
import com.cg.demo.repository.EmployeeRepostory;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	
	
	@Autowired
	EmployeeRepostory repository;
	
	
	
	
	public EmployeeServiceImpl() {
		System.out.println(" inside employee Service Contructor ");
	}

	@Override
	public String saveEmployee(Employee e) {
		
		if(e != null)
		{
			int id = new Random().nextInt(1000);
			e.setId(id);
			return repository.saveEmployee(e);
		}
		return "Wrong Input Exception ";
	}

	@Override
	public Employee getEmployeeById(int searchId) {
		if(searchId !=0)
		{
			Employee e = repository.getEmployeeById(searchId);
			if(e!=null) return e;
			else return null;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("inside service getEmployees()");
		return repository.getAllEmployees();
	}

	@Override
	public List<Employee> getAllEmployee(String searchLocation) {
		return null;
	}
	
	

}
