package task;

public class ArrayDemo {
	int count = 0;
	public static void main(String[] args) {
		
		ArrayDemo app = new ArrayDemo();
		
		int arr1[] = {10,20,10,30,4,7,3,4,20};
		
		int arr2 [] = new int[arr1.length];
		
		arr2[0] = arr1[0]; // copy first element
		//  10,20
		 app.count = 1;// holding the index value of arr2
		
		
		for(int i=1;i<arr1.length;i++)
		{
			
			boolean isExist = app.checkElementInArr2(arr1[i], arr2);
			
			if(isExist == false)
			{
				arr2[app.count] = arr1[i];
				app.count++;
			}
			
			
		}//end of for i
		
		app.doPrint(arr1,"Printing first array");
		app.doPrint(arr2,"Printing second array");
		
	
		
		
		
	}//end main
	public int doSum(int arr[])
	{
		int sum = 0;
		for (int i : arr) {
			sum+=i;
		}
		return sum;
	}
	public void doPrint(int arr[],String tagLine)
	{
		System.out.println("\n\n"+tagLine+"\n------------------\n");
		for (int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
		}
	}
	
	public boolean checkElementInArr2(int elementToCheck,int arr2[])
	{
		boolean isExist = false;
		for(int a=0;a<count;a++)
		{
			if(elementToCheck == arr2[a])
			{
				isExist = true;
				break; // skip
			}
		}
		return isExist;
	}

	
	
}//end class












