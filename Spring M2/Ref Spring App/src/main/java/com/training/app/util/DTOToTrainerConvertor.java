package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.InstructorRegisterRequestDTO;
import com.training.app.entity.Instructor;

@Component
public class DTOToTrainerConvertor {

	public Instructor getInstructorFromDTO(InstructorRegisterRequestDTO dto)
	{
		Instructor temp = new Instructor();
		temp.setInsName(dto.getName());
		temp.setSalary(dto.getSalary());
		temp.setPassword(dto.getPassword());
		temp.setDomain(dto.getDomain());
		temp.setProfile(null);
		
		return temp;
		
	}
}
