package p2;

public class Child extends Parent {

	@Override
	public void billPayment() {
		System.out.println("Digital Payment "+super.getAmount());
	}
	
	public int claimCashBack()
	{
		return (int)(super.getAmount()*0.05);
	}

}
