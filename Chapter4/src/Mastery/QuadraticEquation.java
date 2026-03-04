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
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for A: ");
		double a = input.nextDouble();
		
		System.out.print("Enter a value for B: ");
		double b = input.nextDouble();
		
		System.out.print("Enter a value for C: ");
		double c = input.nextDouble();
		
		// This calculates the discriminant as b^2 - 4*a*c
		double calculateDiscriminant = b * b - 4 * a * c;
		
		// Calculate -b +- the square root of the discriminant
		double root1 = -b - Math.sqrt(calculateDiscriminant);
		double root2 = -b + Math.sqrt(calculateDiscriminant);
		
		// If there is only 2 real roots
		if (calculateDiscriminant > 0)
		{
			double dividing = root1 / (2 * a);
			double dividing2 = root2 / (2 * a);
			System.out.println("The roots are " + dividing + " and " + dividing2);
		}
		// If there is only 1 real root
		else if (calculateDiscriminant == 0)
		{
			double root3 = -b / (2 * a);
			System.out.println("The root is " + root3);
		}
		// If there are no real roots
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