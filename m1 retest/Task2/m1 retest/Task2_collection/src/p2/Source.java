package p2;

import java.util.List;

public class Source {

	public static void main(String[] args) {
		
		BusinessOperation bo = new BusinessOperation();
		List<Food> list = bo.getListofFoodByPrice("HighToLow",Type.veg);
		for (Food food : list) {
			System.out.println(food);
		}
	}
}
