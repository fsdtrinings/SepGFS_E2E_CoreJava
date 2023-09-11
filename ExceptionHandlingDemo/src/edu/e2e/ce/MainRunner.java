package edu.e2e.ce;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println("Enter the no of Tickets :- ");
		int ticketCount = new Scanner(System.in).nextInt();
		try {
			boolean status = new TicketBookingController().bookTicket(ticketCount);
			if(status)
			{
				System.out.println("Ticket booked");
			}
		} catch (OutofTickectExeption e) {
			System.out.println(e.errorMsg());
		}
		
		
	}
}
