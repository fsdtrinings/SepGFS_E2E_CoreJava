package p1;

class Car
{
	String carName;
	String color;
	String carNumber;
	
	Engine e; //has-a
	MusicSystem ms;//has-a
	
	public Car() {
		
	}

	public Car(String carName, String color, String carNumber, Engine e) {
		super();
		this.carName = carName;
		this.color = color;
		this.carNumber = carNumber;
		this.e = e;
	}

	public Car(String carName, String color, 
			String carNumber, Engine e, MusicSystem ms) {
		super();
		this.carName = carName;
		this.color = color;
		this.carNumber = carNumber;
		this.e = e;
		this.ms = ms;
	}

	public Car(String carName, String carNumber, Engine e) {
		super();
		this.carName = carName;
		this.carNumber = carNumber;
		this.e = e;
	}

}

class Engine
{	int power;
	String engineType;
}
class MusicSystem
{
	 String brandName;
}
public class HasADemo {

	public static void main(String[] args) {
		Engine e = new Engine();
		e.engineType = "Petrol";
				
		Car honda = new Car("Honda-ABc", "KA-123", e);
			
// Print the value of Max_Volume of MusicSystem (MusicSystem has Speaker)	
		if(honda.e.engineType.equals("Petrol"))
		{
			System.out.println("Petrol Car");
		}
		else
		{
			System.out.println("Not listed");
		}
	}
}



















