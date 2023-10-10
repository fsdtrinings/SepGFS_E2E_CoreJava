package p1;

enum Type
{
	veg,
	nonVeg
}


public class Food {

	String name;
	int cost;
	Type foodType;
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int cost, Type foodType) {
		super();
		this.name = name;
		this.cost = cost;
		this.foodType = foodType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Type getFoodType() {
		return foodType;
	}
	public void setFoodType(Type foodType) {
		this.foodType = foodType;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", cost=" + cost + ", foodType=" + foodType + "]";
	}
	
	
}
