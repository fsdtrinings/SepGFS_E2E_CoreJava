package com.cg.hrapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestSubmitDTO {

	@NotNull(message = "Cannot be null")
	private String empName;
	@Min(value = 1999,message = "Salary cannot be less than 2000")
	private int salary;
	@Size(min = 2,max = 5,message = "Invalid Designation Value")
	private String designation;
	private String location;
	private String panNumber;
	
	
}
