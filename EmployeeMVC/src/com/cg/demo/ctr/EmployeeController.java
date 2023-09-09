package com.cg.demo.ctr;

import com.cg.demo.model.Developer;
import com.cg.demo.model.Employee;

/*code inside backend*/
public class EmployeeController {

	Employee dbObj;//
	public void createEmployee(Employee e)
	{
		dbObj = e;
	}
	
	public String doEmployeeThings(Employee e)
	{
		if(e instanceof Developer)
		{
			Developer d = (Developer)e;
			return d.attendProjectCall();
		}
		return "";
	}
	
	public Employee getEmployeeFromDB()
	{
		return dbObj;
	}
}
