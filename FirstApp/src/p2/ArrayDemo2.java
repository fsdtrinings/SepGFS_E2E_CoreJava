package p2;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int arr[] = {15,32,10,3,78,64,55,20,9,4,11,88,82,71,69}; // from Db/external src
		
		int searchItem = 82; // user
		int iterations = 0;
		boolean isFound = false;
		for (int i : arr) {
			iterations++;
			if(i == searchItem)
			{
				isFound = true;
				break;
			}
		}
		
		if(isFound)
			System.out.println(searchItem+" in the list");
		else
			System.out.println(searchItem+" Not Found");
		System.out.println("Iteration : - "+iterations);
	}
}
