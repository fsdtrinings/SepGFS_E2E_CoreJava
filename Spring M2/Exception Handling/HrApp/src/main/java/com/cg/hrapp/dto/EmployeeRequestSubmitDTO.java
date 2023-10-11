package com.cg.hrapp.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestSubmitDTO {

	private String empName;
	private int salary;
	private String designation;
	private String location;
	private String panNumber;
	
	
}
