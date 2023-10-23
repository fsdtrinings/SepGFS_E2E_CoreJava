package p3;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Case Study:
 *  Based on the Employee List 
 *   get the average salary paid to Male and Female
 *  or
 *   get the total salary paid to Male and Female
 * 
 *   So in this we will get output in form of Map<String,Integer> 
 *    means Map<Gender,Salary things>
 * */
public class ReduceDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2000, "Male");
		Employee e2 = new Employee(12000, "Female");
		Employee e3 = new Employee(9000, "Male");
		Employee e4 = new Employee(1000, "Male");
		Employee e5 = new Employee(2500, "Female");
		Employee e6 = new Employee(4800, "Male");
		
	/*
	 * so in order to get this , we need to collect the output in map<string,average salary>
	 * so for key: Employee.getGender
	 * for value :- Collectors.<operation type> which will be applying on Bean property
	 * */
		
		Map<String, Double> map= Stream.of(e1,e2,e3,e4,e5,e6).
		collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map);
		
		Map<String, Integer> map2= Stream.of(e1,e2,e3,e4,e5,e6).
				collect(Collectors.groupingBy(Employee::getGender,Collectors.summingInt(Employee::getSalary)));
				
		System.out.println(map2);
	}
}
