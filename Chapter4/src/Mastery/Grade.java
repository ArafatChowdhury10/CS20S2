package Mastery;

import java.util.Scanner;

public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");
		
		int percentage = input.nextInt();
		
		if (percentage <= 59)
		System.out.println("The Corresponding letter grade is: F");
		
		else if (percentage <= 69)
		System.out.println("The Corresponding letter grade is: D");
		
		else if (percentage <= 79)
		System.out.println("The Corresponding letter grade is: C");
		
		else if (percentage <= 89)
		System.out.println("The Corresponding letter grade is: B");
		
		else if (percentage <= 100)
		System.out.println("The Corresponding letter grade is: A");
		
	}

}
