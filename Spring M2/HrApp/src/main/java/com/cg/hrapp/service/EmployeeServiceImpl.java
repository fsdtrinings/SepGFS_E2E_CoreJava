package com.cg.hrapp.service;

import java.util.List;

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
		 Employee savedEmployee = empRepository.getReferenceById(searchId);
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

}
