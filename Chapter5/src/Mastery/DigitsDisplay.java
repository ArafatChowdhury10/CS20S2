/*

Program: DigitsDisplay.java          Last Date of this Revision: March 6, 2026

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
		Scanner input = new Scanner(System.in);
		
		int a;
		
		do 
		{
		System.out.print("Enter a positive integer: ");
		a = input.nextInt();
		
			if (a < 0)
			{
				System.out.println("You did not enter a positive integer. Please enter a positive integer.");
			}
		
		}
		while (a < 0); 
		int divisor = 1;
        int temp = a;
        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }

        // --- CHANGE THIS: Loop to print from left to right ---
        while (divisor > 0) {
            int display = a / divisor;     // Get the front digit
            System.out.println(display); 
            a %= divisor;                  // Keep the remaining digits
            divisor /= 10;                 // Move to the next place value
        }
    }
}

/* Screen Dump

Paste the output of your code here
 
 */
