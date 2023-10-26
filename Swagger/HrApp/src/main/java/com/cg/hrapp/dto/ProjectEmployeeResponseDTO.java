package com.cg.hrapp.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEmployeeResponseDTO {

	private String projectName;
	private String clinetName;
	private String empName;
	private String designation;
}
