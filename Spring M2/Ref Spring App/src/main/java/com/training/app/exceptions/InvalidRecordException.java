package com.training.app.exceptions;

public class InvalidRecordException extends Exception{
	int codeId;
	String role;
	
	public InvalidRecordException(int id,String role) {
		// TODO Auto-generated constructor stub
		codeId = id;
		this.role = role;
	}
	
	public String toString()
	{
		return codeId+" for "+role+" not available in the List";
	}
}
