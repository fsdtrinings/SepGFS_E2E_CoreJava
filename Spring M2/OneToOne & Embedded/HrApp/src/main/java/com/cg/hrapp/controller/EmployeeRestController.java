package com.cg.hrapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Verification;
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
	
	@GetMapping("/employee/location")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Employee>> getEmployees(@RequestParam String loc)
	{
		System.out.println("inside controller getEmployeesBy Location()");
		List<Employee> temp =  empService.getEmployeeByLocation(loc);
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Employee>>(temp, HttpStatus.OK);
	}
	
	@GetMapping("/employee/designation")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Employee>> getEmployeesByDesignation(@RequestParam String des)
	{
		System.out.println("inside controller getEmployeesBy Location()");
		List<Employee> temp =  empService.getEmployeeByDesignation(des);
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Employee>>(temp, HttpStatus.OK);
	}
	
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployeeSalary(@RequestParam int eid,@RequestParam int sal)
	{
		Employee updatedEmployee = empService.updateEmployee(eid, sal);
		Employee e = new Employee();
		if(updatedEmployee != null)
		{
			return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
		}
		else
			return new ResponseEntity<Employee>(e, HttpStatus.NOT_FOUND);
	}
	
	
	@PutMapping("/employee/verification")
	public ResponseEntity<String> addVerification
	         (@RequestBody Verification verification,@RequestParam int id)
	{
		
		String status = empService.addVerificationDetails(id, verification);
		return new ResponseEntity<String>(status,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	@PutMapping("/insurance") // localhost:2002/emp/insurance?empid=5&inscode=1
	public Employee addInsurance
	         (@RequestParam int empid,@RequestParam int inscode)
	{
		
		Employee updatedEmployee = empService.addInsuranceToEmployee(empid, inscode);
		return updatedEmployee;
	}
	
	
}//end class






















