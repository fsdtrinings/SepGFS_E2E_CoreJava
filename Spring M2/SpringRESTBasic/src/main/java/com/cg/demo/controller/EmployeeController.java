package com.cg.demo.controller;

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

import com.cg.demo.entity.Employee;
import com.cg.demo.service.IEmployeeService;

@RestController
@RequestMapping("/myhrapp")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;

	public EmployeeController() {
		System.out.println("inside contructor ");
	}

	@PostMapping("/register/employee")
	public String saveEmployee(@RequestBody Employee e)
	{
		 String notification =  service.saveEmployee(e);
		 return notification;
	}
	
	@GetMapping("/employees")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Employee>> getEmployees()
	{
		System.out.println("inside controller getEmployees()");
		List<Employee> temp =  service.getAllEmployee();
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Employee>>(temp, HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return service.getEmployeeById(id);
	}
	
	
}












