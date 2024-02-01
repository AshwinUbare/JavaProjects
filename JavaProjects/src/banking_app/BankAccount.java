package banking_app;

import java.util.Scanner;

public class BankAccount {

	private String customerName;
	private String customerId;
	private float balance;
	private float previousTransaction;
	
	public BankAccount(String customerName, String customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
		this.balance=0;
		this.previousTransaction=0;
		
		System.out.println("Account Id: "+this.customerId);
		System.out.println("Account Name: "+this.customerName);
		
	}
	
	//function which deposit the amount in account holder
	private void deposit(float amount)
	{
		 if(amount > 0)
		 {
			 balance=balance+amount;
			 previousTransaction= amount;
			 System.out.println("Amount is Deposit Successfully");
			 System.out.println("Current Balance: "+balance);
		 }
		 else
		 {
			 System.out.println("Enter Valid Amount");
		 }
	}
	
	private void withdraw(float amount)
	{
		//This condition check first there is sufficient balance in account
		if(amount > 0)		
		{
			if(balance != 0 && balance >= amount) 
			{
				balance= balance - amount;
				previousTransaction= -amount;
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
	
	public String getBalance()
	{
		return "Account Balance: "+this.balance;
	
	}
	
	
	// Showing option to user(Menu)
	 void showMenu() // default is public
	{
		Scanner sc=new Scanner(System.in);
		
		int option;
		do {
		System.out.println("**************************************************************************");
		System.out.println("Select the option: ");
		System.out.println("1 For Check Balance \n2 For Deposit the Money \n3 For Withdraw the Money \n4 For Previous Transaction \n0 Exit");
		System.out.println("**************************************************************************");
		System.out.print("Enter the choice: ");
		option=sc.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("\nAccount Balance: "+balance);
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
				
			case 0:
				System.out.println("\n**********Exit Successfully***********");
				break;
				
			default:
				System.out.println("\nWrong Choices");
		}
		}while(option != 0);
	}
	
	
}
