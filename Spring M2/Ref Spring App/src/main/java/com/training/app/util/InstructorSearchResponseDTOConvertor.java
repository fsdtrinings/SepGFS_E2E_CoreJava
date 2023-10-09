package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.InstructorSearchResponseDTO;
import com.training.app.entity.Instructor;

@Component
public class InstructorSearchResponseDTOConvertor {

	public InstructorSearchResponseDTO getInstructorSearchDTO(Instructor instructor)
	{
		
		InstructorSearchResponseDTO dto = new InstructorSearchResponseDTO();
		dto.setCode(instructor.getInsCode());
		dto.setName(instructor.getInsName());
		dto.setDomain(instructor.getDomain());
		dto.setEmail(instructor.getProfile().getEmail());
		dto.setAddress(instructor.getProfile().getAddress());
		dto.setPhone(instructor.getProfile().getPhone());
		dto.setSalary(instructor.getSalary());
		dto.setPassword(instructor.getPassword());
		if(instructor.getCourse() != null)
		{
			dto.setCourseId(instructor.getCourse().getCourseId());
			dto.setCourseName(instructor.getCourse().getCourseName());
		}
		else
		{
			dto.setCourseId(0);
			dto.setCourseName("No Allocated");
		}
		
		
		return dto;
	}
}
