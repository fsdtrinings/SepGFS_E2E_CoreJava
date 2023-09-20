package p3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamAPIDemo {
	static List<Employee> allEmployees;
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mike",101, 2000,"Sales");
		Employee e2 = new Employee("Jenny",102, 3000,"Marketing");
		Employee e3 = new Employee("Robert",103, 1200,"Production");
		Employee e4 = new Employee("John",104, 200,"Sales");
		allEmployees = Arrays.asList(e1,e2,e3,e4);
		//callForEach();
		//callFilter();
		List<Employee> list = callFilterWithCollectOperation();
		list.stream().forEach(e->System.out.println(e));
	}//end main
	
	public static List<Employee> callFilterWithCollectOperation()
	{
		List<Employee> outputList = allEmployees.stream().filter((emp)->{
			if(emp.getSalary()>1500) return true;
			else return false;
		}).collect(Collectors.toList());
		
		return outputList;
	}
	
	
	
	
	public static void callFilter()
	{
		allEmployees.stream().filter((emp)->{
			if(emp.getSalary()>1500) return true;
			else return false;
		}).forEach((emp)->{
			System.out.println(emp);
		});
		
		
	}
	
	
	
	public static void callForEach()
	{
		allEmployees.stream().forEach((e)->{
			System.out.println(e.getEmployeeName());
		});
		
	}
	
}//end class










