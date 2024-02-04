package school_management_app;

import java.util.List;

public class School {

	
	private List<Teacher> teacher;
	private List<Student> student;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	public School(List<Teacher> teacher, List<Student> student) {
		
		this.teacher = teacher;
		this.student = student;
		this.totalMoneyEarned=0;
		this.totalMoneyEarned=0;
	}
	
	public List<Teacher> getTeacher()
	{
		return teacher;
	}
	
	public List<Student> getStudent()
	{
		return student;
		
	}
	
	public void setTeacher(List<Teacher> teacher)
	{
		this.teacher=teacher;
	}
	
	public void setStudent(List<Student> student)
	{
		this.student=student;
	}
	

}
