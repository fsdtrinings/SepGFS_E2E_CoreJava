package p1;

public class ConidtionalDemo {

	public static void main(String[] args) {
		
		int subject1 = 80;
		int subject2 = 99;
		int subject3 = 49;
		
		
		/*
		 *   if avg > 90 : ex
		 *   90-75 :  A
		 *   60-74 : B
		 *   else  :  c
		 * 
		 * */
		
		int totalMarks = subject1+subject2+subject3;
		float avg = totalMarks/3;
		
		if(avg>=90) {
			System.out.println("EX");
		}
		else if(avg > 75 && avg <90)
		{
			System.out.println("A");
		}
		else if(avg >60 && avg<75)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		
		
		
	}//end main
}



















