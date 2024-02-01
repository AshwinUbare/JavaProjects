package banking_app;

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
	
	
}
