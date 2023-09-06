package p1;

public class ForLoopDemo3 {

	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0;true;)
		{
			if(i%5 == 0) {
				sum  += i; // sum = sum+i
				
			}
			i +=2;	
			if(i==20)
			{
				break;
			}
		}
		System.out.println(sum);
		
	}
}
