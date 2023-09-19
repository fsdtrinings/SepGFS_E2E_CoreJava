package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class LaptopStoreApp {

	public static void main(String[] args) {
		
		TreeSet<Laptop> allLaptops = new TreeSet<>();
		
		Laptop l1 = new Laptop(2000, "Dell", "D-1",8, 150, 4.2f);
		Laptop l2 = new Laptop(6000, "HP", "HP-1",8, 150, 2.2f);
		Laptop l3 = new Laptop(8000, "Apple", "Apple-2",16, 450, 3.2f);
		Laptop l4 = new Laptop(1000, "Acer", "Acer-3",2, 150, 3.8f);
		Laptop l5 = new Laptop(1200, "Lenovo", "Lenovo-2",8, 150, 4f);
		
		
		allLaptops.add(l1);
		allLaptops.add(l2);
		allLaptops.add(l3);
		allLaptops.add(l4);
		allLaptops.add(l5);
		
		for (Laptop laptop : allLaptops) {
			System.out.println(laptop);
		}
		
		System.out.println("---  Laptops (Low to High)  ----------");
		getLaptopsBasedOnPriceLowToHigh(allLaptops);
		
		System.out.println("---  Laptops (High to Low)  ----------");
		getLaptopsBasedOnPriceHighToLow(allLaptops);
		
		
		
	}
	

	
	public static void getLaptopsBasedOnPriceHighToLow(TreeSet<Laptop> allLaptops)
	{
		// Step1 -> convert set to List
		List<Laptop> tempList = new ArrayList<>();// or pass as constructor argument
		tempList.addAll(allLaptops);
		
		// Step 2-> create Comprator class Object
		SortLaptopBasedOnCostHighToLow sortCode = new SortLaptopBasedOnCostHighToLow();
		
		Collections.sort(tempList, sortCode);
		
		for (Laptop laptop : tempList) {
			System.out.println(laptop);
		}
		 
	}
	
	
	public static void getLaptopsBasedOnPriceLowToHigh(TreeSet<Laptop> allLaptops)
	{
		// Step1 -> convert set to List
		List<Laptop> tempList = new ArrayList<>();// or pass as constructor argument
		tempList.addAll(allLaptops);
		
		// Step 2-> create Comprator class Object
		SortLaptopBasedOnCostLowToHigh sortCode = new SortLaptopBasedOnCostLowToHigh();
		
		Collections.sort(tempList, sortCode);
		
		for (Laptop laptop : tempList) {
			System.out.println(laptop);
		}
		 
	}
	
}//end class


















