package p1;

import java.util.Scanner;

class Account
{
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	public int doDeposit(int amount) 
	{
		return 0; // return current balance
	}
	public int doWithdrawal(int amount) {
		return 0; // return current balance
	}
	
}



public class ScannerDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Cannot Withdraw 600/= as Balance is only : 5400/-");
		
		int i = 10;
		//System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n\nEnter Marks - 1");
		//int marks = sc.nextInt();
		String strMarks = sc.nextLine(); //30
		int marks1 = Integer.parseInt(strMarks);
		
		System.out.println("Enter Marks - 2");
		//int marks = sc.nextInt();
		String strMarks2 = sc.nextLine(); //15
		int marks2 = Integer.parseInt(strMarks2);
		System.out.println(marks1+marks2);// 3015
		
		
		System.out.println("Enter Float");
		String strFloat = sc.nextLine();
		float f = Float.parseFloat(strFloat);
		
		
		
		
	}
}
