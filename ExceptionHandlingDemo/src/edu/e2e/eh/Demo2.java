package edu.e2e.eh;

import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		obj.someWork();
		//obj.doThings(); // error , cannot call outside try-catch
		try {
			obj.doThings();
		}
		catch(IOException e)
		{
			
		}
	}
	public void someWork() {
		
	}
	
	public void doThings()throws IOException
	{
		
	}

}
