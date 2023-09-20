package org.edu.app;

class Documents
{
	String pancard; // BJQPB6259N
	String passportNumber;// K113334B
	
	public Documents(String pancard, String passportNumber) {
	
		if(this.verifyPancard(pancard) && this.verifyPassport(passportNumber))
		{
			this.pancard = pancard;
			this.passportNumber = passportNumber;
		}
		
		
	}
	
	public boolean verifyPancard(String pancard)
	{
		boolean isVerified = false;
		// code to verify pan card
		return isVerified;
	}
	
	public boolean verifyPassport(String passwport)
	{
		boolean isVerified = false;
		// code to verify passport
		return isVerified;
	}
	
	
}

public class StringPracticeTest {

}
