package com.cg.hrapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.service.IEmployeeService;
// localhost:2002/emp//register/employee
@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	IEmployeeService empService;
	// empService = new EmployeeServiceImpl();
	
	public EmployeeRestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@PostMapping("/register/employee")
	public int saveEmployee(@RequestBody Employee e)
	{
		int newId =  empService.saveEmployee(e);
		 return newId;
	}
	
	@GetMapping("/employees")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Employee>> getEmployees()
	{
		System.out.println("inside controller getEmployees()");
		List<Employee> temp =  empService.getAllEmployee();
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Employee>>(temp, HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return empService.getEmployeeById(id);
	}
	
}
