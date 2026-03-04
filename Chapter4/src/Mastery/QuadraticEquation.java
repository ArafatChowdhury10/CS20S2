/*

Program: QuadraticEquation.java           Last Date of this Revision: March 4, 2026

Purpose: An application that finds the real roots of the quadratic equation.  

Author: Arafat Chowdhury, 
School: CHHS
Course: Computer Programming 20

*/

package Mastery;

import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String[] args)
	{
		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter the coefficient "a"
		System.out.print("Enter a value for A: ");
		double a = input.nextDouble();
		
		// Ask the user to enter the coefficient "b"
		System.out.print("Enter a value for B: ");
		double b = input.nextDouble();
		
		// Ask the user to enter the coefficient "c"
		System.out.print("Enter a value for C: ");
		double c = input.nextDouble();
		
		// Calculate the discriminant using the formula b^2 - 4ac
		// The discriminant determines how many real roots exist
		double calculateDiscriminant = b * b - 4 * a * c;
		
		// Calculate the numerator portion of the quadratic formula:
		// -b ± √(discriminant)
		double root1 = -b - Math.sqrt(calculateDiscriminant);
		double root2 = -b + Math.sqrt(calculateDiscriminant);
		
		// If the discriminant is greater than 0,
		// there are two different real roots
		if (calculateDiscriminant > 0)
		{
			// Divide each numerator by 2a to get the final roots
			double dividing = root1 / (2 * a);
			double dividing2 = root2 / (2 * a);
			
			// Display both roots
			System.out.println("The roots are " + dividing + " and " + dividing2);
		}
		// If the discriminant equals 0,
		// there is exactly one real root
		else if (calculateDiscriminant == 0)
		{
			// Calculate the single root
			double root3 = -b / (2 * a);
			
			// Display the root
			System.out.println("The root is " + root3);
		}
		// If the discriminant is less than 0,
		// there are no real roots (only complex roots)
		else
		{
			System.out.println("There are no real roots ");
		}
	}
}


/* Screen Dump

Enter a value for A: 3
Enter a value for B: 2
Enter a value for C: 1
There are no real roots 

Enter a value for A: 2
Enter a value for B: 4
Enter a value for C: -30
The roots are -5.0 and 3.0

Enter a value for A: 1
Enter a value for B: -4
Enter a value for C: 4
The root is 2.0
 
 */