package p1;

import java.util.List;

public class Source {

	public static void main(String[] args) {
		
		OrderTracker2 tracker = new OrderTracker2();
		
		//List<Food> filteredList   = tracker.getFoodOrdersByType(Type.veg);
		List<Integer> filteredList   = tracker.getFoodOrdersByType(Type.veg);
		
		System.out.println(filteredList);
	}
}
