package p2;

class Employee {
	int workLoad = 0;

	public Employee login(){
		workLoad += 1;
		return this;
	}

	public Employee moringSession(){
		workLoad += 1000;
		return this;
	}
	public Employee teaBreak(){
		workLoad -= 5;
		return this;
	}
	public Employee crConnect()
	{
		workLoad += 500;
		return this;
	}
	
	
	

}

public class CHainOfResponsibility {
	public static void main(String[] args) {
		Employee ramesh = new Employee();
		ramesh.login().moringSession().teaBreak().crConnect();
		System.out.println(ramesh.workLoad);
				
	}
}
