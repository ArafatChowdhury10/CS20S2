/*

Program: DigitsDisplay.java          Last Date of this Revision: March 9, 2026

Purpose: 

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Scanner;

public class DigitsDisplay
{
	public static void main(String[] args)
	{
		// Create Scanner object to read user input from keyboard
		Scanner input = new Scanner(System.in);
		
		int a;  // Variable to store the integer entered by the user
		
		// Loop that keeps asking the user until they enter a positive integer
		do 
		{
			System.out.print("Enter a positive integer: ");
			a = input.nextInt();  // Read the integer input
			
			// If the number is negative, display an error message
			if (a < 0)
			{
				System.out.println("You did not enter a positive integer. Please enter a positive integer.");
			}
		
		}
		while (a < 0); // Repeat the loop if the number is negative
		
		int divisor = 1; // Will store the highest place value divisor (1, 10, 100, etc.)
        int temp = a;    // Temporary copy of the number so we don't modify the original
        
        // Determine the largest place value of the number
        // Example: if a = 5432, divisor becomes 1000
        while (temp >= 10) 
        {
            temp /= 10;     // Remove the last digit from temp
            divisor *= 10;  // Increase divisor to the next place value
        }

        // Loop to display each digit from left to right
        while (divisor > 0) 
        {
            int display = a / divisor; // Get the leftmost digit
            System.out.println(display); // Print the digit on a new line
            
            a %= divisor;   // Remove the printed digit from the number
            divisor /= 10;  // Move to the next place value (1000 → 100 → 10 → 1)
        }
    }
}

/* Screen Dump

Enter a positive integer: -7342
You did not enter a positive integer. Please enter a positive integer.
Enter a positive integer: 6342
6
3
4
2
 
 */
