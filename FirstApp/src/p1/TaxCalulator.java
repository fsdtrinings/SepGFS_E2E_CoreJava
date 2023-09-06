package p1;

public class TaxCalulator {

	public static void main(String[] args) {
		
		int basicSalary = 5000; // monthly basic salary
		int hra = (int)(basicSalary * 0.15);
		int da = (int)((basicSalary+hra) * 0.10);
		
		int annualSalary = (basicSalary+hra+da)*12;
		int tax = 0;
		int taxPercentage = 0;
		if(annualSalary<300000)
		{
			taxPercentage = 0;
			tax = 0;
		}
		else if(annualSalary>300000 && annualSalary<700000)
		{
			taxPercentage = 10;
			tax = (int)(annualSalary * 0.10);
		}
		else 
		{
			taxPercentage = 20;
			tax = (int)(annualSalary * 0.20);
		}
		
		System.out.println("Basic Salary "+basicSalary);
		System.out.println("HRA 15% of Basic "+hra);
		System.out.println("DA 10% of Basic&HRA :"+da);
		System.out.println("Annual Salary :-  "+annualSalary);
		System.out.println("Tax @ "+taxPercentage+"% : "+tax);
		
		
	}
}











