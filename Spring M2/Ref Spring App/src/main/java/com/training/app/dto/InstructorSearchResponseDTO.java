package com.training.app.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorSearchResponseDTO {
	private int code;
	private String name;
	private String domain;
	private String email;
	private long phone;
	private String address;
	private int salary;
	private String password;
	private int courseId;
	private String courseName;
}
