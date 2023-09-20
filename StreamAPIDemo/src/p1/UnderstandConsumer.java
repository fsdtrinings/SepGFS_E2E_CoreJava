package p1;

import java.util.function.Consumer;

public class UnderstandConsumer {
	
	public static void main(String[] args) {
		Consumer<Integer> con = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				int x = t+1000;
				System.out.println(x);
			}
		};
		int arr[] = {10,20,30,11,12,38,17,22};
		for (int i : arr) {
			con.accept(i);
		}
		System.out.println(" ------- Through Lambda------");
		Consumer<Integer> con2 = (t)->{
			int x= t+1000;
			System.out.println(x);
		};
		for (int i : arr) {
			con2.accept(i);
		}
		
	}

}















