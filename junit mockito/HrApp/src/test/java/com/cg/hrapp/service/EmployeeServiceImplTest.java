package com.cg.hrapp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.repository.IEmployeeRepository;

@SpringBootTest
class EmployeeServiceImplTest {

	@MockBean
	IEmployeeRepository mockEmployeeRepository ; // class inside class , which we don't want to use actual
	@Autowired
	EmployeeServiceImpl employeeService; // class under test
	
	
	@Test
	@DisplayName("To Get Employee By Location & Designation")
	void testGetEmployeeByLocationAndDesignation() {
		
		Employee e1 = new Employee(1, "A", 20000,null, null, null, null, null);
		
		String inputLocation = "Banglore";
		String inputDesignation = "Developer";
		
		List<Employee> actualOutput = new ArrayList<>();
		actualOutput.add(e1);
		
		// ---- preparing actual output using Mock ---
		when(mockEmployeeRepository.
				getEmployeeByLocationAndDesignation(inputDesignation,inputLocation)).
				thenReturn(actualOutput);
		
		// calling actual method and comparing expectedOutput with actual output
		assertIterableEquals(actualOutput, 
				employeeService.getEmployeeByLocationAndDesignation
				(inputDesignation, inputLocation));
		
	}

	@Test
	@Disabled
	void testGetProjectByEmployeeId() {
		
	}

	@Test
	void testGetEmployeeById() {
		Employee actualOutput = new Employee(1, "A", 20000,null, null, null, null, null);
		Employee e = new Employee(1, "A", 20000,null, null, null, null, null);
		
		Optional<Employee> thisTypeOfOutput = Optional.of(e);
		when(mockEmployeeRepository.findById(1)).thenReturn(thisTypeOfOutput);
		
		assertEquals(actualOutput, employeeService.getEmployeeById(1));
	}
	
	@Test
	@DisplayName("Test to check Exception")
	void testGetEmployeeByIdException() {
		
		when(mockEmployeeRepository.findById(1)).
		      thenThrow(NoSuchElementException.class);
		
		assertThrows(NoSuchElementException.class, ()->{
			employeeService.getEmployeeById(1);
		});
	}
	

}







