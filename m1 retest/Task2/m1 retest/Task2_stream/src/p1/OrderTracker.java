package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderTracker {

	List<Food> allOrders = new ArrayList<>();
	
	public OrderTracker() {
		
		Food f1 = new Food("Chicken Biryani",100, Type.nonVeg);
		Food f2 = new Food("Dosa",60, Type.veg);
		Food f3 = new Food("Piza",360, Type.veg);
		
		allOrders.add(f1);
		allOrders.add(f2);
		allOrders.add(f3);
	}
	
	public List<String> getAllNamesofFoodItems()
	{
		return null;
	}
	
	public List<Food> getFoodOrdersByType(Type searchType)
	{
		return allOrders.stream().filter((f)->{
			if(f.getFoodType() == searchType) return true;
			else return false;
		}).collect(Collectors.toList());
	}
	
	
	
 

}















