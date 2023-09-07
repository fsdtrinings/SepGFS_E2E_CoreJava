package task;

public class EmailTask {
	
	public static void main(String[] args) {
		EmailTask obj = new EmailTask();
		
		String allEmails[] = {
				"ramesh@gmail.com",
				"suresh@outlook.com",
				"mahesh@cg.com",
				"rakesh@gmail.com",
				"lokesh@gmail.com",
	
		};
		
		
		String searchDomainName = "gmail.com";//user input
		
		for(String email:allEmails)
		{
			boolean status = obj.verifyEmail(email,searchDomainName);
			if(status)
			{
				obj.printEmails(email);
			}
		}
		
		
	}
	
	public  void printEmails(String email)
	{
		System.out.println(email);
	}
	
	public  boolean verifyEmail(String email,String domainName)
	{
		
		return email.endsWith(domainName);
	}

}











