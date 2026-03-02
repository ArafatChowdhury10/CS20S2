package SkillBuilders;

import java.util.Scanner;

public class Hurricane 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hurricane category (1-5): ");
		
		int windSpeed = input.nextInt();
		
		if (windSpeed == 1)
		System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
		
		else if (windSpeed == 2)
		System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
		
		else if (windSpeed == 3)
		System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
		
		else if (windSpeed == 4)
		System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
		
		else if(windSpeed == 5)
		System.out.println("Catagory 5: greater than 155 mph or 135 lt or 249 km/hr");
		
		else
		{
			System.out.println("You didn't pick the categories from 1-5. Try again.");
		}
	

	}

}