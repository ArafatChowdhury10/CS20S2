package SkillBuilders;

public class Student 
{
	//Instance variables
	private String fullName;
	private double gpa;

	//Constructor method
	public Student(String stuName, double startingGPA)
	{
		fullName = stuName;
		gpa = startingGPA;
	}
	
	//Accessor methods
	public String getFullName()
	{
		return fullName;
	}
	public double getGPA()
	{
		return gpa;
	}
	
	//Modifier methods
	public void setFullName (String nm)
	{
		fullName = nm;
	}
	public void setGPA(double)
	{
		
	}
	
}
