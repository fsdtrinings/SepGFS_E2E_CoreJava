package com.cg.hrapp.util;

import org.springframework.stereotype.Component;

import com.cg.hrapp.dto.ProjectEmployeeResponseDTO;
import com.cg.hrapp.entity.Employee;

@Component
public class ProjectEmployeeResponseDTOConvertor {

	
	public ProjectEmployeeResponseDTO getProjectDTO(Employee e)
	{
		ProjectEmployeeResponseDTO dto = new ProjectEmployeeResponseDTO();
		
		dto.setClinetName(e.getProject().getClientName());
		dto.setProjectName(e.getProject().getProjectName());
		dto.setEmpName(e.getEmpName());
		dto.setDesignation(e.getDesignation());
		
		return dto;
	}
}
