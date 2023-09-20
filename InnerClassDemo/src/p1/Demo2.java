package p1;

class Laptop 
{
   public void playGame()
   {
	   System.out.println("Play Games ....Called");
   }
   
   public void checkMail()
   {
	   Wifi wifi = ()->{
		 return 800;  
	   };
	
	if(wifi.getConnection()>400)
	{
		System.out.println("do whatsapp call");
	}
	else
	{
		System.out.println("No internet connection found...");
	}
	   
   }
}//end class


public class Demo2 {

	public static void main(String[] args) {
		MobilePhone myPhn = new MobilePhone();
		myPhn.playGame();
		myPhn.whatappCall();
		
		myPhn.shareThroughBluetooth(new Bluetooth() {
			
			@Override
			public int shareFile(String fileName) {
				
				return 1800;
			}
		}, "MyData.pdf");
		
		
		
	}
}
/*
class BV5 implements Bluetooth
{

	@Override
	public int shareFile(String fileName) {
		return 1800;
	}
	
}


*/
















