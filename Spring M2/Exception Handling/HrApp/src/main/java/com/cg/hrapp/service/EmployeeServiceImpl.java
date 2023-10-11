package com.cg.hrapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Insurance;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.entity.Verification;
import com.cg.hrapp.exceptions.InvalidDesignationException;
import com.cg.hrapp.repository.IEmployeeRepository;
import com.cg.hrapp.repository.IInsuranceRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository empRepository;
	
	@Autowired
	IInsuranceRepository insuranceRepository;
	
	// Animal a = new Dog();
	
	
	
	
	
	
	
	@Override
	@Transactional
	public int saveEmployee(Employee e) throws InvalidDesignationException
	{
	
		if(e == null ) throw new NullPointerException("e is null");
		else if(e!=null)
		{
			if(e.getDesignation().equals("A"))
			{
				System.err.println("Inside checking designationd");
				throw new InvalidDesignationException("A is not the validDesignation",EmployeeServiceImpl.class+"");
			}
		}
		Employee savedEmployee = empRepository.save(e);
		if(savedEmployee !=null)
		{
			
			return savedEmployee.getEmpid();
		}
		return 0;
		
	}

	@Override
	public Project getProjectByEmployeeId(int empId) {
		Employee e = getEmployeeById(empId);
		if(e != null)return e.getProject();
		else throw new NullPointerException("Employee "+empId+" is invalid "+e);
	}

	@Override
	@Transactional
	public String addVerificationDetails(int searchId, Verification verification) {
		Employee savedEmp = getEmployeeById(searchId);
		if(savedEmp != null)
		{
			savedEmp.setEmpVerification(verification);// will call update query in DB
			return "Verifcation Added "+savedEmp.getEmpVerification().isStatus();
		}
		else return "Verification Error "+savedEmp;
	}
	
	
	@Override
	@Transactional
	public Employee addInsuranceToEmployee(int searchId, int insuranceCode) {
		Employee savedEmp = getEmployeeById(searchId); // fetch employee from table 
		Insurance insurance = insuranceRepository.findById(insuranceCode).get();  // fetch insurance from table
		
		if(savedEmp != null && insurance != null) // if both are not null / exist in table
		{
			savedEmp.setInsurance(insurance);// call update query on employee table to add insurance
			
			return savedEmp;
		}
		return null;
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
	public List<Employee> getEmployeeByDesignation(String designation) 
	{
		if(designation == null || designation.isEmpty())
		{
			throw new NullPointerException("Invalid Designation Value "+designation);
		}
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

















