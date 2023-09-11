package edu.e2e.ce;

public class OutofTickectExeption extends Exception{
	
	int orderUnits;
	
	
	
	public OutofTickectExeption(int orderUnits) {
		super();
		this.orderUnits = orderUnits;
	}



	public String errorMsg()
	{
		return "Cannot book "+orderUnits+" Tickets";
	}

}
