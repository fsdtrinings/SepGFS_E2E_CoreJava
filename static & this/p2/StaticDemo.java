package p2;

class Bank
{
   static String serverIPAddress = "192.168.2.1";
   
   String branchName ;
}

public class StaticDemo {

	int i = 10;
	static int x = 20;
	
	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		
		System.out.println(obj.i);
		System.out.println(x);
		
	}
	
	public void doThings()
	{
		System.out.println(i);
		System.out.println(x);
		
	}
}
