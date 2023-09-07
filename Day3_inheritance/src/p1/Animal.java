package p1;

public class Animal {

	
	private int leg;
	private int weight;
	
	public Animal() {
		System.out.println("Animal");
	}
	public Animal(int leg, int weight) {
		super();
		this.leg = leg;
		this.weight = weight;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
			this.leg = leg;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// ------------------
	
	public void eatFood()
	{
		System.out.println("Animal eat food method called");
	}
}















