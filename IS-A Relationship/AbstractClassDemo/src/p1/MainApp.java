package p1;

public class MainApp {

	public static void main(String[] args) {
		
		MainApp officePortal = new MainApp();
		
		
		
		
		Developer dev = new Developer();
		dev.setEmployeeName("Ramesh");
		dev.setId(103);
		dev.setSalary(4600);
		dev.setGrade(3);
		dev.setYearlyBonus(250000);
		dev.setProjectName("My Bank App");
		officePortal.printEmployeeDetails(dev);
	
		System.out.println("-------------");
		SalesExceutive emp1 = new SalesExceutive("Mike",101,2000,"Sales","Banglore",
				 50000,60000);
		
		officePortal.printEmployeeDetails(emp1);
	
		System.out.println("-------------");
		
		Hr hrExecutive = new Hr("Aditi",102, 1500, "Hr", 200);
		officePortal.printEmployeeDetails(hrExecutive);
		
		
		System.out.println("-------------");
		
		
		
		
		
		
		
	}//end main
	
	public void printEmployeeDetails(Employee e)
	{
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee Id "+e.getId());
		System.out.println("Employee Salary "+e.getSalary());
		
		if(e instanceof Developer)
		{
			Developer d = (Developer)e;
			d.attendProjectCall();
		}
		if(e instanceof Hr)
		{
			Hr hr = (Hr)e;
			hr.conductSession();
		}
		
	}
	
}//end class





