/*

Program: Num.java          Last Date of this Revision: April 29, 2026

Purpose: An object that stores a number and returns its ones, tens, hundreds, and whole value.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

public class Num
{
    private int number;

    // constructor stores the user number
    public Num(int inputNumber)
    {
        number = inputNumber;
    }

    // returns whole number
    public int getWholeNumber()
    {
        return number;
    }

    // returns ones digit
    public int getOnes()
    {
        return number % 10;
    }

    // returns tens digit
    public int getTens()
    {
        return (number / 10) % 10;
    }

    // returns hundreds digit
    public int getHundreds()
    {
        return (number / 100) % 10;
    }
}