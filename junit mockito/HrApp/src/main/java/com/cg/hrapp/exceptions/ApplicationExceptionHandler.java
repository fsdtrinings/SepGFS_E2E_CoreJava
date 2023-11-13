package com.cg.hrapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> doSomeThings(NullPointerException e)
	{
		ExceptionResponse resp = new ExceptionResponse(e.getMessage(), e.getCause().toString());
		return new ResponseEntity<ExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> doSomeThings2(InvalidDesignationException e)
	{
		System.err.println("Inside Exception Handler Invalid Designation");
		ExceptionResponse resp = new ExceptionResponse(e.getErrorMsg(),e.getSrcResName());
		return new ResponseEntity<ExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
