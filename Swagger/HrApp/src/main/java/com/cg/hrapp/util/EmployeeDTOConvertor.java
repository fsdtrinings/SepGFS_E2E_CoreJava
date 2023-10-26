package com.cg.hrapp.util;

import org.springframework.stereotype.Component;

import com.cg.hrapp.dto.EmployeeRequestSubmitDTO;
import com.cg.hrapp.entity.Employee;
import com.cg.hrapp.entity.Project;
import com.cg.hrapp.entity.Verification;

@Component
public class EmployeeDTOConvertor {

	
	public Employee getEmployeeFromEmployeeDTO(EmployeeRequestSubmitDTO dto)
	{
		Employee e = new Employee();
		
		e.setEmpName(dto.getEmpName());
		e.setLocation(dto.getLocation());
		e.setDesignation(dto.getDesignation());
		e.setSalary(dto.getSalary());
		
		Verification kyc = new Verification(dto.getPanNumber(), true);
		e.setEmpVerification(kyc);
		
		
		return e;
		
		
	}
}
