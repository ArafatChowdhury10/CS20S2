/*

Program: DigitExtractor.java          Last Date of this Revision: April 29, 2026

Purpose: A method that starts the program and runs the addition game.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;

public class DigitExtractor
{
    private Scanner input;

    // constructor initializes Scanner for user input
    public DigitExtractor()
    {
        input = new Scanner(System.in);
    }

    // starts and runs the main program loop
    public void start()
    {
        // prompt user for an integer
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // create Num object to store and process digits
        Num number = new Num(num);

        // loop menu until user chooses to quit
        while(true)
        {
            // display menu options
            System.out.println("\nShow (W)hole number.");
            System.out.println("Show (O)nes number.");
            System.out.println("Show (T)ens number.");
            System.out.println("Show (H)undreds place number.");
            System.out.println("Enter (Q)uit.");

            // get user choice and convert to lowercase
            System.out.print("Enter your choice: ");
            String choice = input.next().toLowerCase();

            // exit program
            if(choice.equals("q"))
            {
                System.out.println("Goodbye!s");
                return;
            
            }
            // display whole number
            else if(choice.equals("w"))
            {
                System.out.println("Whole number is: " + number.getWholeNumber());
            }
            // display ones digit
            else if(choice.equals("o"))
            {
                System.out.println("Ones digit is: " + number.getOnes());
            }
            // display tens digit
            else if(choice.equals("t"))
            {
                System.out.println("Tens digit is: " + number.getTens());
            }
            // display hundreds digit
            else if(choice.equals("h"))
            {
                System.out.println("Hundreds digit is: " + number.getHundreds());
            }
        }
    }
}