package p1;

/*calling class members*/
public class Class2 {

	public static void main(String[] args) {
		
		Laptop hp = new Laptop();
		hp.setBrandName("HP-Laptop");
		hp.setCost(3000);
		System.out.println(hp.getCost());
		System.out.println(hp.getBrandName());
		System.out.println(hp.getRam());
		
		System.out.println("________________________-");
		Laptop dell = new Laptop();
		dell.setCost(2000);
		System.out.println(dell.getCost());
	}
}
