package edu.training.hrapp;

import java.time.LocalDate;

import edu.training.hrapp.dao.DatabaseOperations;
import edu.training.hrapp.models.Employee;
import edu.training.hrapp.models.Insurance;
import edu.training.hrapp.models.Verification;
import edu.training.hrapp.util.DateConvertor;

public class MainClass {

	DatabaseOperations dbOps;
	
	public MainClass() {
		dbOps = new DatabaseOperations();
	}
	
	public static void main(String[] args) {
		MainClass app = new MainClass();
		app.createEmployee();
		//app.getEmployee();
	}
	
	public void getEmployee()
	{
		long searchId = 1;
		displayEmployee(dbOps.getEmployeeById(searchId));
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(e);
	}
	
	public  void createEmployee()
	{
		String strDob = "12-2-1989";
		String strDoj = "28-11-2021";
		
		LocalDate dob = DateConvertor.getDateFromString(strDob);
		LocalDate doj = DateConvertor.getDateFromString(strDoj);
		
		Employee e = new Employee( "Sunita",70000, "Ex-Manager",
				"Marketing", dob, doj);
		
		Verification kyc = new Verification("12345", "AJQPB6d8934", null, true);
		e.setKyc(kyc);
		
		Insurance ins = new Insurance("Medical Insurance", 500000);
		e.setInsurance(ins);
		
		dbOps.saveEmployee(e);
	}
}
