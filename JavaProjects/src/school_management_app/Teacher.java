package school_management_app;

public class Teacher {

	private int id;
	private String name;
	private int salary;
	
	public Teacher(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	 
	// setting or updating salary
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	

}
