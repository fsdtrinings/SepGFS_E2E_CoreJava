package p1;

public class SalesExceutive extends Employee
{
	private String location;
	private int target;
	private int salesMade;
	private int incentives;
	
	public SalesExceutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public SalesExceutive(String employeeName, int id, int salary, String department,String location,
			int target, int salesMade) {
		super(employeeName, id, salary, department);
		this.location = location;
		this.target = target;
		this.salesMade = salesMade;
		this.incentives = incentives;
	}
	
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public int getSalesMade() {
		return salesMade;
	}
	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}
	public int getIncentives() {
		return incentives;
	}
	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}
	
	public void launchProduct()
	{
		System.out.println("Sales man Launch product called ");
	}
	
	
	
	@Override
	public int getSalary() {
		int actualSalary = super.getSalary();
		int extraSales = this.salesMade - this.target;
		
		if(extraSales>0)
		{
			this.incentives = (int)(extraSales*0.20f);
		}
		if(extraSales<=0)
		{
			this.incentives = 0;
		}
		
		actualSalary = super.getSalary()+this.incentives;
		
		return actualSalary;
	}



	

	

}
































