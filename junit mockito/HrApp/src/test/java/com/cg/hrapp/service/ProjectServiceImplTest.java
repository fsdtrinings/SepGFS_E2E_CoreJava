package com.cg.hrapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.hrapp.entity.Project;
import com.cg.hrapp.repository.IProjectRepository;

@SpringBootTest
class ProjectServiceImplTest {


	@MockBean	
	IProjectRepository projectRepository;
	@MockBean
	EmployeeServiceImpl empService; 

	@Autowired
	ProjectServiceImpl classUnderTest;
	
	@Test
	void testGetProjectByID() {
	
		Project actualOutput = new Project("ABC-App", "ABC");
		Optional<Project> opPro = Optional.of(actualOutput);
		
		
		int input = 1;
		Mockito.when(projectRepository.findById(input)).thenReturn(opPro);
		
		
		assertEquals(opPro.get(), classUnderTest.getProjectByID(input));
		
	}

}









