package banking_app;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount {

	private String customerName;
	private String customerId;
	private float balance;
	private float previousTransaction;
	
	// for printing 2-digit decimal we use DecimalFormat class
	private static final DecimalFormat df=new DecimalFormat("0.00");
	
	public BankAccount(String customerName, String customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
		this.balance=1000;
		this.previousTransaction=0;
		
		System.out.println("Welcome "+this.customerName);
		System.out.println("Account Id: "+this.customerId);
		System.out.println("Account Name: "+this.customerName);
		
	}
	
	//function which deposit the amount in account 
	private void deposit(float amount)
	{
		 if(amount > 0)
		 {
			 balance=balance+amount;
			 previousTransaction= amount;
			 System.out.println("Amount is Deposit Successfully");
			 
			 //we are sending balance to format function of decimal class and receiving balance with 2-decimal format
			 // but this format class receive double data variable but we sending float data type
			 System.out.println("Current Balance: "+df.format(balance)); // df is object
		 }
		 else
		 {
			 System.out.println("Enter Valid Amount");
		 }
	}
	
	//function which withdraw the amount in account 
	private void withdraw(float amount)
	{
		//This condition check first there is sufficient balance in account
		if(amount > 0)		
		{
			if(balance != 0 && balance >= amount) 
			{
				balance= balance - amount;
				previousTransaction= -amount;  // here we store negative value to understand amount is withdraw
				System.out.println("Amount is Withdraw Successfully");
			}
			else
				System.out.println("Insufficient Balance");
		}
		else
		{
			System.out.println("Please Enter Valid Amount");
		}
	}
	
	private void getPreviousTransaction()
	{
		if(previousTransaction != 0)
		{
			if(previousTransaction >0)
			{
				System.out.println("Amount Deposited: "+previousTransaction);
			}
			else if(previousTransaction<0)
			{
				System.out.println("Amount Withdraw: "+Math.abs(previousTransaction));
			}
		}
		else
		{
			System.out.println("No Transaction is Occured");
		}
			
	}
	
	public String getBalance()
	{
		return "Account Balance: "+df.format(this.balance);
	}
	
	
	// Showing option to user(Menu)
	 void showMenu()                            // default is public
	{
		Scanner sc=new Scanner(System.in);
		
		int option;
		do {
		System.out.println("\n**************************************************************************");
		System.out.println("Select the option: ");
		System.out.println("1 For Check Balance \n2 For Deposit the Money \n3 For Withdraw the Money \n4 For Previous Transaction \n0 Exit");
		System.out.println("**************************************************************************");
		System.out.print("\nEnter the choice: ");
		option=sc.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("\nAccount Balance: "+df.format(balance));
				break;
				
			case 2:
				System.out.print("\nEnter the Amount: ");
				float deAmount=sc.nextFloat();
				deposit(deAmount);
				break;
			
			case 3:
				System.out.print("\nEnter the Amount: ");
				float wdAmount=sc.nextFloat();
				withdraw(wdAmount);
				break;
				
			case 4:
				getPreviousTransaction();
				break;

				
			case 0:
				System.out.println("\n**********Exit Successfully***********");
				break;
				
			default:
				System.out.println("\nWrong Choice");
		}
		}while(option != 0);
		
	}
	
	
}
