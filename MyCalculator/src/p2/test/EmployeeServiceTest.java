package p2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p2.Employee;
import p2.EmployeeService;
import p2.InvalidSalaryException;

class EmployeeServiceTest {

	
	EmployeeService service;
	
	@BeforeEach
	public void init()
	{
		System.out.println("inside init");
		
		service  = new EmployeeService();
	}
	
	@BeforeAll
	public void doThings()
	{
		// use to execute such case which should be available before running.
	}
	
	@Test
	@DisplayName("Adding employee for all normal values")
	void testAddEmployee() {
		
		
	
		//service  = new EmployeeService();
		System.out.println("inside test "+service);
		Employee sampleInput = new Employee(151, "test", 2000);
		String actual = service.addEmployee(sampleInput);
		String expected = "Employee created 151";
		
		assertEquals(actual,expected);
		// verify the list
		assertEquals(service.getAllEmployees().size(), 1);
		
	}
	
	@Test
	@DisplayName("test AddEmployeeToCheck Salary Excption")
	void testAddEmployeeToCheckSalaryExcption()
	{
		assertThrows(InvalidSalaryException.class, ()->{
			//service  = new EmployeeService();
			service.addEmployee(new Employee(1, "test", 0));
		});
	}
	
	@Test
	@DisplayName("test AddEmployeeToCheck Name not null Excption")
	void testAddEmployeeToCheckNullException()
	{
		assertThrows(NullPointerException.class, ()->{
			//service  = new EmployeeService();
			service.addEmployee(new Employee(1, null, 2000));
		});
	}
	

	@Test
	//@Disabled
	void testGetEmployeeById() {
		

		//service  = new EmployeeService();
		service.addEmployee(new Employee(1, "Test1",2000));
		service.addEmployee(new Employee(2, "Test2",2000));
		service.addEmployee(new Employee(3, "Test3",2000));
		
		
		Employee actual= service.getEmployeeById(1);
		Employee expected = new Employee(1, "Test1",2000);
		assertEquals(expected, actual);
		
		
	}
	
	
	@Test
	//@Disabled
	void testGetEmployeeByIdForNullCheck() {
		

		//service  = new EmployeeService();
		service.addEmployee(new Employee(1, "Test1",2000));
		service.addEmployee(new Employee(2, "Test2",2000));
		service.addEmployee(new Employee(3, "Test3",2000));
		
		
		Employee actual= service.getEmployeeById(5);
		//Employee expected = null;
		assertNull(actual);
		
		
	}

}














