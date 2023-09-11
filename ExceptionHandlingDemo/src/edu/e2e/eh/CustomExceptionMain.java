package edu.e2e.eh;

import javax.naming.NamingException;

public class CustomExceptionMain {

	public static void main(String[] args) throws CGException,NamingException
	{
		CGException exp = new CGException();
		if(true)
		{
			throw exp;
		}
		else {
			throw new NamingException();
		}
			
		// as per rule : a method can only throw those exceptions 
		//which is mentioned in throws clause
		
	}
}
