/*

Program: EvensAndOdds.java          Last Date of this Revision: May 11, 2026

Purpose: An application that generates 25 random integers between 0 and 99, then separates and displays the odd numbers on one line and the even numbers on another line.

Author: Arafat Chowdhury, 
School: CHHS
Course: Computer Programming 20
 
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("ODD:");

        // Store numbers so they can be checked again for evens
        int[] numbers = new int[25];

        // Generate 25 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0 - 99

            // Display odd numbers
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + "  ");
            }
        }

        System.out.println("\nEVEN:");

        // Display even numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }
}

/* Screen Dump

ODD:
75  69  95  21  29  27  75  41  29  77  33  95  
EVEN:
20  42  4  90  92  26  42  0  16  46  4  48  58  
 
 */