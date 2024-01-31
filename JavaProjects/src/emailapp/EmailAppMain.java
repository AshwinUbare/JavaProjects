package emailapp;

public class EmailAppMain {

	public static void main(String[] args) {

		String depStatus;
		Email e1= new Email("Anmol","Patil");
		
		
		// getting department status
		depStatus=e1.getDepartment();
		
		if(depStatus!="")
		{
			// giving alternate email
			e1.setAlternateEmail("anmolpati05@gmail.com");
			// printing alternate email & mailbox capacity
			System.out.println("Your Alternate Email: "+e1.getAlternateEmail());
			System.out.println("Mailbox Capacity: "+e1.getMailboxCapacity());
		
			// changing mail box capacity
			e1.setMailboxCapacity(550);
		    // calling showInfo function and printing the data
		    System.out.println(e1.showInfo());
		}
		
	}

}
