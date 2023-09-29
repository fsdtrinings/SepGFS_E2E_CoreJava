package edu.training.hrapp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import edu.training.hrapp.dao.DatabaseOperations;
import edu.training.hrapp.models.ContractualEmployee;
import edu.training.hrapp.models.Employee;
import edu.training.hrapp.models.Insurance;
import edu.training.hrapp.models.Project;
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
		app.createContractEmployee();
		//app.getEmployee();
		//app.addProject();
		//app.allocateProject();
	}
	
	private void createContractEmployee() {
		
		
		Employee e = new ContractualEmployee(52, "Java FSD");
		e.setFullname("Madhu");
		e.setDesignation("Training Manager");
	
		dbOps.saveEmployee(e);
	}

	public void allocateProject()
	{
		int pid = 31; // entered by user
		
		Employee e1 = dbOps.getEmployeeById(1);// empId
		Employee e2 = dbOps.getEmployeeById(3);
		Employee e3 = dbOps.getEmployeeById(4);
		
		Set<Employee> allEmployees = new HashSet<Employee>();
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		
		dbOps.allocateEmployeestoProject(pid, allEmployees);
		
	}
	
	
	public void addProject()
	{
		Project p1 = new Project(31, "Airbus-ClientSupport", "Airbus");
		dbOps.saveProject(p1);
		Project p2 = new Project(32, "Airbus-ABCJob", "Airbus");
		dbOps.saveProject(p2);
		Project p3 = new Project(33, "CitiBank-ClientSupport", "Citi Bank");
		dbOps.saveProject(p3);
		
	}
	
	public void getEmployee()
	{
		long searchId = 1;
		displayEmployee(dbOps.getEmployeeById(searchId));
	}
	
	public void displayEmployee(Employee e)
	{
		System.out.println(e);
		System.out.println("----------------------");
		System.out.println(e.getProject().getClientName()+" - "+e.getProject().getProjectname());
		
	}
	
	public  void createEmployee()
	{
		String strDob = "12-2-1989";
		String strDoj = "28-11-2021";
		
		LocalDate dob = DateConvertor.getDateFromString(strDob);
		LocalDate doj = DateConvertor.getDateFromString(strDoj);
		
		
		
		
		Employee e = new Employee( "Amit Kumar",70000, "Ex-Manager",
				"Dev", dob, doj);
		Verification kyc = new Verification("9864523", "vffPB6d8934", null, true);
		e.setKyc(kyc);
		Insurance ins = new Insurance("Medical Insurance", 500000);
		e.setInsurance(ins);
		
		Employee e2 = new Employee( "Vindo",70000, "Ex-Manager",
				"Dev", dob, doj);
		Verification kyc2 = new Verification("8523698", "edf6d8934", null, true);
		e2.setKyc(kyc2);
		Insurance ins2 = new Insurance("Life Cover", 500000);
		e2.setInsurance(ins2);
		
		
		
		
		
		
		dbOps.saveEmployee(e);
		dbOps.saveEmployee(e2);
		
	}
}
