package p1;

import java.util.Comparator;

public class SortLaptopBasedOnCostLowToHigh implements Comparator<Laptop>{

	@Override
	public int compare(Laptop laptop1, Laptop laptop2) {
		return laptop1.getCost() - laptop2.getCost();
	}
	
	

}
