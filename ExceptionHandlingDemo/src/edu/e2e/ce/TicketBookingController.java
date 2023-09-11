package edu.e2e.ce;
/*logic of ticket booking*/
public class TicketBookingController {

	public boolean bookTicket(int noOfSeats)
			throws OutofTickectExeption
	{
		boolean status = false;
		if(noOfSeats>=6)
		{
			throw new OutofTickectExeption(noOfSeats);
		}
		else
		{
			status = true;
		}
		
		return status;
	}
}
