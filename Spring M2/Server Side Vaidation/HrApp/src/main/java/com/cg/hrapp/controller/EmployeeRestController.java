package com.cg.hrapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.dto.EmployeeRequestSubmitDTO;
import com.cg.hrapp.dto.ProjectEmployeeResponseDTO;
import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.entity.Verification;
import com.cg.hrapp.exceptions.InvalidDesignationException;
import com.cg.hrapp.service.EmployeeServiceImpl;
import com.cg.hrapp.service.IEmployeeService;
import com.cg.hrapp.util.EmployeeDTOConvertor;
// localhost:2002/emp//register/employee
import com.cg.hrapp.util.ProjectEmployeeResponseDTOConvertor;


@RestController
@RequestMapping("/emp")
@Validated
public class EmployeeRestController {

	@Autowired
	IEmployeeService empService;
	

	
	
	@Autowired
	ProjectEmployeeResponseDTOConvertor dtoConvertor;
	
	@Autowired
	EmployeeDTOConvertor empDtoConvertor;
	
	
	public EmployeeRestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@PostMapping("/register/employee")
	public int saveEmployee(@RequestBody  @Valid EmployeeRequestSubmitDTO dto)
			throws NullPointerException,InvalidDesignationException
	{
		Employee e = empDtoConvertor.getEmployeeFromEmployeeDTO(dto);
		
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
	
	@RequestMapping(method = RequestMethod.GET,path = "/employee/{id}")
	//@GetMapping("/employee/{id}")
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
	public ResponseEntity<List<Employee>> getEmployeesByDesignation(@RequestParam String des)throws NullPointerException
	{
		
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
	
	@GetMapping("/project")  /// www.localhost:9211/emp/project?empid=2
	public ResponseEntity<ProjectEmployeeResponseDTO> getEmployeesProject(@RequestParam int empid)
	{
		Employee e = empService.getEmployeeById(empid);
		
		ProjectEmployeeResponseDTO dto = dtoConvertor.getProjectDTO(e);
		
		return new ResponseEntity<ProjectEmployeeResponseDTO>(dto,HttpStatus.OK);
	}
}//end class






















