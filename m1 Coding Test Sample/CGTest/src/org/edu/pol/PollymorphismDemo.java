package org.edu.pol;

abstract class Customer {
	public String username;
	public int billAmount;

	public abstract int payBill();
}

class OnlineCustomer extends Customer {
	public int payBill() {
		return 1000;
	}

	public float claimCashBack() {
		return super.billAmount * 0.05f;
	}
}

public class PollymorphismDemo {
	public static void main(String[] args) {
		// call doUserThings methods
	}
	public void doUserThings(Customer customer)
	{
		// call claim cash back method
	}
}
