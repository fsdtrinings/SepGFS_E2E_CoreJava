package task.execption;

import java.util.Arrays;

import entity.Food;
import entity.Review;

public class MainRunner {

	public static void main(String[] args) {
		
		FoodService service = new FoodService();
		
		Food food1 = new Food("", 8, null, Arrays.asList(new Review("A", 0, "Good")));
		
		Food food2 = new Food();
		food2.setFoodItemName("French Green Salad");
		food2.setCost(199);
		food2.setRegion("Europe");
		
		try {
			service.validateFood(food2);
			service.validateFood(food1);
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		 * change the catch statement and use multiple catch for 
		 * 1) InvalidFoodDetailsException
		 * 2) InvalidFoodRegionException
		 * 3) NullPointerException
		 * 4) Exception for any other issue 
		 * */
		
		
	}
}
