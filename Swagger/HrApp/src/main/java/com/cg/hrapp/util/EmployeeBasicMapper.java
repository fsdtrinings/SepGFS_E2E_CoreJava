package com.cg.hrapp.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.hrapp.dto.EmployeeBasicDTO;
import com.cg.hrapp.entity.Employee;

@Component
public class EmployeeBasicMapper {
	
	
	public List<EmployeeBasicDTO> mapEmployeeListToDTOList(List<Employee> list)
	{
		List<EmployeeBasicDTO> dtoList = new ArrayList<>();
		for (Employee employee : list) {
			EmployeeBasicDTO dto = mapEmployeeToDTO(employee);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	
	public EmployeeBasicDTO mapEmployeeToDTO(Employee e)
	{
		EmployeeBasicDTO dto = new EmployeeBasicDTO();
		if(e != null)
		{
			dto.setEmployeeName(e.getEmpName());
			dto.setEmpId(e.getEmpid());
			dto.setDesignation(e.getDesignation());
			dto.setLocation(e.getLocation());
			
			if(e.getEmpVerification() != null)
			{
				dto.setPanNumber(e.getEmpVerification().getPanNumber());
			}
			else dto.setPanNumber(" Verification Pending ");
			
			if(e.getProject() != null)
			{
				dto.setProjectName(e.getProject().getProjectName());
			}
			else dto.setProjectName("Project Not Assigned");
		}
		else dto = null;
		return dto;
	}

}
