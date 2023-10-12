package task.collection;

import java.util.List;
import java.util.Map;

import entity.Food;
import entity.Type;

/* Change code accordingly*/
public class MainClass {

	public static void main(String[] args) {
		
		BusinessCollectionOperation task = new BusinessCollectionOperation();
		
		System.out.println(" Print Food Based on Price High To Low");
		task.getFoodByPriceHighToLow(Type.NON_VEG);
		System.out.println("----------------------");
		
		System.out.println(" Print Food Based on Reviews");
		task.getFoodByAvgReview(null);
		System.out.println("----------------------");
		
		System.out.println(" Print Food Based on Type & Region");
		task.groupFoodBasedOnTypeAndRegion();
		
		
		
		
	}
}
