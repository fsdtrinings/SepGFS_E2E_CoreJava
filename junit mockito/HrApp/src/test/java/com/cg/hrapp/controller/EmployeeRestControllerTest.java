package com.cg.hrapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.hrapp.dto.EmployeeBasicDTO;
import com.cg.hrapp.dto.EmployeeRequestSubmitDTO;
import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.exceptions.InvalidDesignationException;
import com.cg.hrapp.service.EmployeeServiceImpl;
import com.cg.hrapp.util.EmployeeBasicMapper;
import com.cg.hrapp.util.EmployeeDTOConvertor;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class EmployeeRestControllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@Autowired
	EmployeeRestController empController;
	
	@Autowired
	EmployeeDTOConvertor empDtoConvertor;
	@Autowired
	EmployeeBasicMapper dtomapper;
	@MockBean
	private EmployeeServiceImpl employeeServiceMock;
	
	private EmployeeRequestSubmitDTO saveInput;
	private EmployeeRequestSubmitDTO saveOutput;
	
	@BeforeEach
	void setup()
	{
		saveInput = new EmployeeRequestSubmitDTO(0,"Ramesh",2000,"Developer","Delhi","ABC123");
		saveOutput = new EmployeeRequestSubmitDTO(1,"Ramesh",2000,"Developer","Delhi","ABC123");
		
	}
	
	@Test
	void testSaveEmployee()throws Exception 
	{
		Employee e = empDtoConvertor.getEmployeeFromEmployeeDTO(saveInput);
		int newId = 1;
		Mockito.when(employeeServiceMock.saveEmployee(e)).thenReturn(newId);
		mockmvc.perform(
				MockMvcRequestBuilders.post("/register/employee").
				contentType(MediaType.APPLICATION_JSON).
				content("{\r\n"
						+ "    \"empName\": \"Ramesh\",\r\n"
						+ "    \"location\": \"Delhi\",\r\n"
						+ "    \"salary\": 2000,\r\n"
						+ "    \"designation\": \"Developer\",\r\n"
						+ "     \"panNumber\":\"ABC123\"\r\n"
						+ "\r\n"
						+ "}"));
		
		
	}
	
	

	@Test
	void testGetEmployeeById() {
		Employee e = new Employee(1, null, 0, null, null, null, null, null);
		EmployeeBasicDTO dto= dtomapper.mapEmployeeToDTO(e);
		
		Mockito.when(employeeServiceMock.getEmployeeById(1)).thenReturn(e);
		EmployeeBasicDTO actualDto = empController.getEmployeeById(1);
		assertEquals(dto,actualDto);
		
	}

	

	


}
