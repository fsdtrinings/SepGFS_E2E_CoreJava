package p1;

public class MainClass {

	public int doSum(int x,int y)
	{
		if(x<1)
		{
			throw new NullPointerException();
		}
		return x+y;
	}
}
