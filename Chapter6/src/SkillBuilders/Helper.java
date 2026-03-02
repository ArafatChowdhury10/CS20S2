package SkillBuilders;

public class Helper 
{
	public static void sayHello()	//signature of any method
	{
		System.out.println("Hello! Welcome to learning methods!");
	}
	
	public static void greetPerson(String name, int age)
	{
		System.out.println("Hi" +  name  + "!");
		System.out.println("You are " + age + "years old.");
		
		if(age >= 18)
		{
			System.out.println("You're old enough to drive");
		}
		else
		{
			System.out.println("You're stll young!");
		}
		System.out.println("-----------------------");
	}
	
	
	public static double calculateCircleArea(double radius)
	{
		double area = Math.PI * radius * radius;
		
		return area;
		
	}

	public static String getMoodMessage(int happinessLevel)
	{
		if(happinessLevel >= 80)
		{
			return("You're absolutely glowing today!");
		}
		else if (happinessLevel >= 50)
		{
			return("You're doing pretty good - keep it up!");
		}
		else
		{
			return("Today feels a bit heavy...want a virtual hug?");
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("===Demonstrating Methods ===\n");
		
		//Calling method #1
		sayHello();
		
		//Calling method #2 with arguments
		greetPerson("Sara", 22);
		greetPerson("Liam", 16);
		
		
		//Calling method #3 using the returned value 
		double r = 5.0;
		double area = calculateCircleArea(r);
		//System.out.println("Circle has an area of: "+ area);
		

	}

}
