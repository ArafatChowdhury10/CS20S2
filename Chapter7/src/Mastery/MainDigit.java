/*

Program: MainDigit.java          Last Date of this Revision: April 29, 2026

Purpose: Purpose: A method that starts the digit extraction application.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

public class MainDigit
{
    // starts the program
    public static void main(String[] args)
    {
        DigitExtractor app = new DigitExtractor();
        app.start();
    }
}
/* Screen Dump
Enter an integer: 634

Show (W)hole number.
Show (O)nes number.
Show (T)ens number.
Show (H)undreds place number.
Enter (Q)uit.
Enter your choice: w
Whole number is: 634

Show (W)hole number.
Show (O)nes number.
Show (T)ens number.
Show (H)undreds place number.
Enter (Q)uit.
Enter your choice: o
Ones digit is: 4

Show (W)hole number.
Show (O)nes number.
Show (T)ens number.
Show (H)undreds place number.
Enter (Q)uit.
Enter your choice: t
Tens digit is: 3

Show (W)hole number.
Show (O)nes number.
Show (T)ens number.
Show (H)undreds place number.
Enter (Q)uit.
Enter your choice: h
Hundreds digit is: 6

Show (W)hole number.
Show (O)nes number.
Show (T)ens number.
Show (H)undreds place number.
Enter (Q)uit.
Enter your choice: q
Goodbye!

 
 */