package school_management_app;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int paidFees;
	private int totalFees;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param grade
	 */
	
	public Student(int id, String name, int grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.totalFees=25000;
		this.paidFees=0;
	}
	
	public void setGreade(int grade)
	{
		this.grade=grade;
	}
	
	public void updateFees(int fees)
	{
		paidFees=fees;
	}
	
	public String getPaidFees()
	{
		return "Total Fees Paid by Student: "+this.paidFees;
	}
	
}
