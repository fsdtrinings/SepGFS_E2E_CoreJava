package edu.training.hrapp;

import java.time.LocalDate;

import edu.training.hrapp.dao.DatabaseOperations;
import edu.training.hrapp.models.Employee;
import edu.training.hrapp.util.DateConvertor;

public class MainClass {

	DatabaseOperations dbOps;
	
	public MainClass() {
		dbOps = new DatabaseOperations();
	}
	
	public static void main(String[] args) {
		MainClass app = new MainClass();
		//app.createEmployee();
		app.getEmployee();
	}
	
	public void getEmployee()
	{
		int searchId = 1;
		displayEmployee(dbOps.getEmployeeById(searchId));
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(e);
	}
	
	public  void createEmployee()
	{
		String strDob = "12-2-1979";
		String strDoj = "28-11-2015";
		
		LocalDate dob = DateConvertor.getDateFromString(strDob);
		LocalDate doj = DateConvertor.getDateFromString(strDoj);
		Employee e = new Employee( "Kavita",60000, "Manager",
				"Marketing", dob, doj);
		
		dbOps.saveEmployee(e);
	}
}
