package p2;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.setAmount(1000);
		p.billPayment(); // child method output
		//p.claimCashBack();// compile time error
		Child c = (Child)p;
		int x = c.claimCashBack();
		System.out.println("cash back "+x);
		System.out.println(" --- wrong call ----");
		Child child = new Child();
		int y = child.claimCashBack();
		System.out.println("cash back "+y);
		
	}
}
