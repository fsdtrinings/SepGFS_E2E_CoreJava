package p2;

import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) 
	{
		Stream.of(10,20,30,11,12,38,17,22)
		.forEach((x)->{
			int t = x+100;
			System.out.println(t);
		});
		
		// =====
		int arr[] = {10,20,30,11,12,38,17,22};
		for (int  p : arr) {
			System.out.println(p);
		}
	}
}
