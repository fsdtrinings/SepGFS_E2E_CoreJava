package p1;

import java.util.function.Predicate;

public class UnderstandPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (t)->{
			if(t>100)
			{
				return true;
			}
			else return false;
				
		};
		
		int arr[] = {10,300,600,20,80,150};
		for (int i : arr) {
			if(p.test(i))
			{
				System.out.println(i);
			}
		}
		
	}
}
