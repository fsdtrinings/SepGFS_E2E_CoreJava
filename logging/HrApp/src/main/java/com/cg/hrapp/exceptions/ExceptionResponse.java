package com.cg.hrapp.exceptions;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

	private String error;
	private String srcName;
	
}
