package p1;


enum Coffee
{
   LARGE,
   MEDIUM,
   SMALL,
   WRONG_OPTION
}


public class EnumDemo {

	public static void main(String[] args) {
		
		EnumDemo demo = new EnumDemo();
		Coffee coffeeCup = demo.getCoffee(100);
		
		if(coffeeCup == Coffee.LARGE) // if(coffeeCup.equals("100ML"))
		{
			
		}
		
		switch (coffeeCup) {
		case LARGE:
			
			break;
			
		case MEDIUM:
			break;
		case SMALL:
			break;

		default:
			break;
		}
		
		
	}
	
	public Coffee getCoffee(int price)
	{
		if(price == 100)
		{
			return Coffee.LARGE;  // 100ml
		}
		else if(price == 60)
		{
			return Coffee.MEDIUM;//50ml
		}
		else if(price == 40)
		{
			return Coffee.SMALL;
		}
		return Coffee.WRONG_OPTION;
	}
	
	/*
	 * public void doTest() { float abc = 15.5f; switch (abc) { case 3.5f:
	 * System.out.println("case 1"); break;
	 * 
	 * default: break; } }
	 */
	
	
	
	
}















