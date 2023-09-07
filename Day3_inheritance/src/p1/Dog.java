package p1;

public class Dog extends Animal{

	String name;

	public Dog() {
		System.out.println("Dog");
	}

	public Dog(int leg, int weight) {
		super(leg, weight);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void playGames()
	{
		System.out.println("Dog play Game");
	}
	
}








