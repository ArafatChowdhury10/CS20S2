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

public class DigitsSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int sum = 0;

        do 
        {
        	System.out.print("Enter a positive integer: ");
            a = input.nextInt();

            if (a < 0) 
            {
                System.out.println("You did not put a positive integer. Please enter a positive integer.");
            }

        } 
        while (a < 0);

        while (a > 0) 
        {
            sum += a % 10;
            a /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}

/* Screen Dump

Enter a positive integer: -382342
You did not put a positive integer. Please enter a positive integer.
Enter a positive integer: 45324
The sum of the digits is: 18
 
 */