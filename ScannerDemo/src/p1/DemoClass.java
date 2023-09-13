package p1;

public class DemoClass {

	String s;
	public void doThings(String b)
	{
		
		s=s.concat(b+"null");
	}
	
	public void caller(String s)
	{
		doThings("Kumar");
	}
	
	
	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		d.s = "Ramesh";
		d.caller(d.s);
		System.out.println(d.s);
		
		
		
	}
}
