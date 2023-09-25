package p2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	List<Employee> allEmployees = new ArrayList<>();
	
	public String addEmployee(Employee e)throws InvalidSalaryException
	{
		if(e.getSalary()<1)
		{
			throw new InvalidSalaryException("Salary cannot be less than zero");
		}
		else if(e.getName() == null)
		{
			throw new NullPointerException("Name cannot be null");
		}
		else
		{
			allEmployees.add(e);
			return "Employee created "+e.getId();
		}
		
	}
	
	
	
	public List<Employee> getAllEmployees() {
		return allEmployees;
	}



	public void setAllEmployees(List<Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}



	public Employee getEmployeeById(int searchId)
	{
		/*
		return allEmployees.stream().filter((e)->{
			if(e.getId() == searchId) return true;
			else return false;
		}).findFirst().get();
		*/
		
		for (Employee employee : allEmployees) {
			if(employee.getId() == searchId) return employee;
			
		}
		
		return null;
	}
	 
}
