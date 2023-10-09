package com.training.app.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorRegisterRequestDTO {
	
	private String name;
	private String password;
	private int salary;
	private String domain;
}
