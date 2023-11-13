package com.cg.hrapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hrapp.dto.EmployeeBasicDTO;
import com.cg.hrapp.dto.EmployeeRequestSubmitDTO;
import com.cg.hrapp.dto.ProjectEmployeeResponseDTO;
import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.entity.Verification;
import com.cg.hrapp.exceptions.InvalidDesignationException;
import com.cg.hrapp.service.EmployeeServiceImpl;
import com.cg.hrapp.service.IEmployeeService;
import com.cg.hrapp.util.EmployeeBasicMapper;
import com.cg.hrapp.util.EmployeeDTOConvertor;
// localhost:2002/emp//register/employee
import com.cg.hrapp.util.ProjectEmployeeResponseDTOConvertor;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "All Employee Specific Employee Endpoints")
@RestController
@RequestMapping("/emp")
@CrossOrigin(origins = {"http://localhost:2002", "http://localhost:4200"},allowedHeaders = "*")
public class EmployeeRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IEmployeeService empService;
	
	@Autowired
	EmployeeBasicMapper dtomapper;
	
	@Autowired
	ProjectEmployeeResponseDTOConvertor dtoConvertor;
	
	@Autowired
	EmployeeDTOConvertor empDtoConvertor;
	
	
	public EmployeeRestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@ApiOperation(value="Endpoint to get list of employees based on designation & location , URL takes two required parameters des & loc resp.")
	@GetMapping("/filter")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<EmployeeBasicDTO>> getEmployeesByLocAndDes
		(@RequestParam(required = true) String des,@RequestParam(required = true) String loc)
	{
		List<Employee> temp =  empService.getEmployeeByLocationAndDesignation(des, loc);
		
		List<EmployeeBasicDTO> list = dtomapper.mapEmployeeListToDTOList(temp);
		
		return new ResponseEntity<List<EmployeeBasicDTO>>(list, HttpStatus.OK);
	}
	
	
	@ApiOperation(value="API to Save Employee , User have to pass DTO, template given in the resources folder ")
	@PostMapping("/register/employee")
	public EmployeeRequestSubmitDTO saveEmployee(@RequestBody  EmployeeRequestSubmitDTO dto)
			throws NullPointerException,InvalidDesignationException
	{
		
		logger.trace("saveEmployee() service Started with dto "+dto);
		Employee e = empDtoConvertor.getEmployeeFromEmployeeDTO(dto);
		if(e.getEmpName()== null || e.getEmpName().isBlank())
		{
			logger.debug("employee name is empty , which should not be empty");
		}
		int newId =  empService.saveEmployee(e);
		if(newId!=0)
		{
			logger.info("saveEmployee() service Saved Employee and return Id:-  "+newId);
			dto.setEmpId(newId);
			if(dto.getEmpName() == null || dto.getEmpName().isBlank())
			{
				logger.warn("Employee With No Name created !!! ");
			}
			return dto;
		}
		else {
			logger.error("unable to create Employee");
			dto.setEmpName("Error");
			dto.setDesignation("Error");
			dto.setSalary(0);
			return dto;
		}
	}
	
	@GetMapping("/employees")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<EmployeeBasicDTO>> getEmployees()
	{
		System.out.println("inside controller getEmployees()");
		List<Employee> temp =  empService.getAllEmployee();
		
		List<EmployeeBasicDTO> temp2 = new ArrayList<>();
		
		for (Employee e : temp) {
			EmployeeBasicDTO dto= dtomapper.mapEmployeeToDTO(e);
			temp2.add(dto);
		}
		
		return new ResponseEntity<List<EmployeeBasicDTO>>(temp2, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/employee/{id}")
	//@GetMapping("/employee/{id}")
	public EmployeeBasicDTO getEmployeeById(@PathVariable int id)
	{
		Employee e = empService.getEmployeeById(id);
		EmployeeBasicDTO dto= dtomapper.mapEmployeeToDTO(e);
		return dto;
	}
	
	@GetMapping("/employee/location")  /// www.localhost:9211/myhrapp/employees
	public ResponseEntity<List<Employee>> getEmployees(@RequestParam String loc)
	{
		System.out.println("inside controller getEmployeesBy Location()");
		List<Employee> temp =  empService.getEmployeeByLocation(loc);
		int size = temp.size();
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






















