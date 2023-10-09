package com.training.app.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseTrainerDTO {
	private String trainerName;
	private String courseName;
	private boolean status;
	
}
