package com.cg.hrapp.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBasicDTO {

	private String employeeName;
	private int empId;
	private String designation;
	private String location;
	private String projectName;
	private String panNumber;
	private String verificationStatus;
	
}
