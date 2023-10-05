package com.cg.hrapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository empRepository;
	
	// Animal a = new Dog();
	
	
	
	@Override
	@Transactional
	public int saveEmployee(Employee e) {
		Employee savedEmployee = empRepository.save(e);
		if(savedEmployee !=null)
		{
			return savedEmployee.getEmpid();
		}
		else return 0;
	}

	@Override
	public Employee getEmployeeById(int searchId) {
		 Employee savedEmployee = empRepository.findById(searchId).get();
		 if(savedEmployee !=null)
			{
				return savedEmployee;
			}
			else return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> allSavedEmployees =  empRepository.findAll();
		if(allSavedEmployees != null || allSavedEmployees.size() != 0)
		{
			return allSavedEmployees;
		}
		else return null;
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String designation) {
		return empRepository.getEmployeeByDesignation(designation);
	}
	
	@Override
	public List<Employee> getEmployeeByLocation(String location) {
		return empRepository.getEmployeeByLocation(location);
	}
	
	@Override
	@Transactional
	public Employee updateEmployee(int searchId,int newSalary)
	{
		Employee savedEmployee = getEmployeeById(searchId);
		if(savedEmployee!=null)
		{
			savedEmployee.setSalary(newSalary);
			return savedEmployee;
		}
		
		
		return null;
	}
	
	

}//end impl class

















