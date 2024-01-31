package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int passLength;
	private String companyName;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName)
	{
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.passLength=10;
		 this.companyName="confix.com";
		 this.mailboxCapacity=500; // it is default mailbox capacity
		 System.out.println("New Worker: "+this.firstName+" "+this.lastName);
		 
		 // calling method and asking to user for department and response is store.
		 this.department=setDepartment();
		 
		 
		 if(this.department!="")
		 {
			 System.out.println("\nDepartment: "+this.department);
			 
			 //calling method who gives randomPassword
			 this.password=randomPassword(passLength);	  	
			 System.out.println("Your Password: "+this.password);
	
			 // generating email;
			 email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName;
			 System.out.println("Your Email: "+email);
		 }
		 else
			 System.out.println("\nSelect Proper Department");
		 
	}
	
	//Showing Department list to user and getting input from user
	private String setDepartment()
	{
		System.out.print("Select department \n1 For Sales\n2 For Development\n3 For Accounting\n0 For none\nEnter Department name:");
	    Scanner sc=new Scanner(System.in);
	    int depNumber=sc.nextInt();
	    
	  // we can use Switch or if-else condition
	    
	    if(depNumber == 1)
	     return "sales";
	    else if(depNumber == 2)
	    	return "devlopment";
	    else if(depNumber == 3)
	    	return "accounting";
	    else
	    	return "";
	}
	
	// Creating or generating random password
	private String randomPassword(int length)
	{
		String passwordSet="abcdefghijklmnopqrstuvwxyz0123456789!@#$%&";   // here we give data for creating password
		char[]password=new char[length];
		for(int i=0; i<length;i++)
		{
			int rand= (int)(Math.random() * passwordSet.length());
			// Math.random() : random is method of class Math it gives random number in double data type in rang of 0-1 
			// (int) : it convert double data type into int data type
			// multiply by passwordSet length to get proper number 
			
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password); 
		// type-casting: password is in char array so it is converted in to String
	}
	
	
	// set method
	// changing mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	// storing alternating email
	public void setAlternateEmail(String alternateEmail)
	{
		this.alternateEmail=alternateEmail;
	}
	
	
	// Changing password of user
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	
	// get methods
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	
	// it can show or return the worker data to calling function
	public String showInfo()
	{
		// we can print here as it is so we use return type is 'void'
		
		/*
		System.out.println("\nName: "+this.firstName+" "+this.lastName);
		System.out.println("Company Email: "+this.email);
		System.out.println("Personal Email: "+this.alternateEmail);
		System.out.println("Mailbox Capacity: "+this.mailboxCapacity);
		*/
		
		// we can return data to calling function so use return type is String 
		
		return "\nName: " + firstName + " " + lastName +
				"\nCompany Email: "+ email +
				"\nPersonal Email: "+ alternateEmail +
				"\nMailbox Capacity: "+ mailboxCapacity;
		
	}

}
