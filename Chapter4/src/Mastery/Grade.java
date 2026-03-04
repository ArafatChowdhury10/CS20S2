/*

Program: Grade.java          Last Date of this Revision: March 4, 2026

Purpose: An application that gives a grade letter based on the percentage

Author: Arafat Chowdhury, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class Grade 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");
		
		int percentage = input.nextInt();
	
		//If percentage is lower than 59 percent
		if (percentage <= 59)
		{
			System.out.println("The Corresponding letter grade is: F");			
		}
		
		//If percentage is lower than 69 percent
		else if (percentage <= 69)
		{
			System.out.println("The Corresponding letter grade is: D");
		}
		
		//If percentage is lower than 79 percent
		else if (percentage <= 79)
		{
			System.out.println("The Corresponding letter grade is: C");
		}
		
		//If percentage is lower than 89 percent
		else if (percentage <= 89)
		{
			System.out.println("The Corresponding letter grade is: B");
		}
		
		//If percentage is lower than 100 percent
		else if (percentage <= 100)
		{
			System.out.println("The Corresponding letter grade is: A");
		}
		
		//If the user puts an invalid percentage, display this message
		else
		{
			System.out.println("Invalid percentage!");	
		}
		
	}

}

/* Screen Dump

Enter the percentage: 20
The Corresponding letter grade is: F

Enter the percentage: 60
The Corresponding letter grade is: D

Enter the percentage: 72
The Corresponding letter grade is: C

Enter the percentage: 85
The Corresponding letter grade is: B

Enter the percentage: 93
The Corresponding letter grade is: A
 
 */