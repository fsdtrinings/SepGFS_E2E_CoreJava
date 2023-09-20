package p1;

@FunctionalInterface
interface Wifi{
	public int getConnection();
}

interface Bluetooth
{
  public int shareFile(String fileName);	
}

class MobilePhone 
{
   public void playGame()
   {
	   System.out.println("Play Games ....Called");
   }
   
   public void shareThroughBluetooth(Bluetooth b,String fileFile)
   {
	   int x = b.shareFile(fileFile);
	   System.out.println("File Shared ..."+x);
   }
   
   
   

   public void whatappCall()
   {
	   Wifi airtel = new Wifi() {
		
		@Override
		public int getConnection() {
			// lot of code to access internet 
			return 500;
		}
	};
	
	
	
	if(airtel.getConnection()>400)
	{
		System.out.println("do whatsapp call");
	}
	else
	{
		System.out.println("No internet connection found...");
	}
	   
   }
}//end class


public class Demo1 {

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
















