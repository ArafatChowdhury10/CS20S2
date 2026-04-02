/*

Program: PerfectIntegers.java          Last Date of this Revision: April 1, 2026

Purpose: An application that finds and displays all perfect numbers from 1 to 100

Author: Arafat Chowdhury
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

public class PerfectIntegers 
{
    public static void main(String[] args) 
    {
        // Loop through numbers from 1 to 100
        for (int a = 1; a <= 100; a++)
        {
            // Check if number is perfect
            if (isPerfect(a))
            {
                System.out.println(a);
            }
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number)
    {
        int sum = 0;

        // Find all factors less than the number
        for (int i = 1; i < number; i++) 
        {
            if (number % i == 0) 
            {
                sum += i;
            }
        }
        
        // Check if sum of factors equals the number
        return sum == number;
    }
}
/* Screen Dump

6
28
 
 */