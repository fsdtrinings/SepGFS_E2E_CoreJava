package com.cg.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.demo.entity.Employee;

@Component
public class EmployeeRepostory {

	List<Employee>  allEmployees = new ArrayList<>();
	
	
	
	public EmployeeRepostory() {
		
		System.out.println(" inside employee repository Contructor ");
		Employee e1 = new Employee("Ramesh", "Banglore", 2000);
		Employee e2 = new Employee("Suresh", "Maglore", 2000);
		Employee e3 = new Employee("Rakesh", "Banglore", 2000);
		
		allEmployees.add(e3);
		allEmployees.add(e2);
		allEmployees.add(e1);
		
	}
	
	public Employee getEmployeeById(int id)
	{
		return allEmployees.stream().filter((e)->{
			if(e.getId() == id) return true;
			else return false;
		}).findFirst().get();
	}

	public List<Employee> getAllEmployees() {
		System.out.println("inside repo getEmployees() "+allEmployees.size());
		return allEmployees;
	}

	public String saveEmployee(Employee e)
	{
		allEmployees.add(e);
		return "Employee Added "+e.getId();
	}
	
	
}
