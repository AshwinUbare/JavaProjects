package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int passLength;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName)
	{
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.passLength=7;
		 System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		 
		 // calling method and asking to user for department and response is store.
		 this.department=setDepartment();
		 System.out.println("Department: "+this.department);
		 
		 //calling method who gives randomPassword
		 this.password=randomPassword(passLength);	  	
		 System.out.println("Default Password iS: "+this.password);
	}
	
	private String setDepartment()
	{
		System.out.println("Select department \n1 For Sales\n2 For Development\n3 For Accounting\n0 For none\nEnter Department name:");
	    Scanner sc=new Scanner(System.in);
	    int depNumber=sc.nextInt();
	    
//	    we can use Switch or if else condition
	    
	    if(depNumber == 1)
	     return "Sales";
	    else if(depNumber == 2)
	    	return "Devlopment";
	    else if(depNumber == 3)
	    	return "Accounting";
	    else
	    	return "";
	}
	
	// Creating or generating random password
	private String randomPassword(int length)
	{
		String passwordSet="abcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";   // here we give data for creating password
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
	

}
