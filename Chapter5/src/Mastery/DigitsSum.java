/*
Program: DigitsSum.java          Last Date of this Revision: March 6, 2026

Purpose: An application that prompts the user to enter a positive integer 
and then calculates and displays the sum of the digits of that number.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class DigitsSum 
{

    public static void main(String[] args) 
    {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        int a;          // Variable to store the number entered by the user
        int sum = 0;    // Variable to store the sum of the digits

        // Keep asking the user until they enter a positive integer
        do 
        {
            System.out.print("Enter a positive integer: ");
            a = input.nextInt();   // Read the integer entered by the user

            // If the number is negative, display an error message
            if (a < 0) 
            {
                System.out.println("You did not put a positive integer. Please enter a positive integer.");
            }

        } 
        while (a < 0);  // Repeat the loop if the number is negative

        // Loop to calculate the sum of the digits
        while (a > 0) 
        {
            sum += a % 10; // Get the last digit using modulus and add it to sum
            a /= 10;       // Remove the last digit from the number
        }

        // Display the final sum of all digits
        System.out.println("The sum of the digits is: " + sum);
    }
}

/* Screen Dump

Enter a positive integer: -382342
You did not put a positive integer. Please enter a positive integer.
Enter a positive integer: 45324
The sum of the digits is: 18
 
 */