/*

Program: Question.java          Last Date of this Revision: April 29, 2026

Purpose: An object that represents one single math problem.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;
import java.util.Random;

public class Question 
{
    private int firstNumber; // first random number
    private int secondNumber; // second random number

    public Question()
    {
        firstNumber = (int)(Math.random() * 21); // generate random number from 0–20
        secondNumber = (int)(Math.random() * 21); // generate random number from 0–20
    }

    // returns the question as a string (e.g., "5 + 7 = ")
    public String getQuestion()
    {
        return firstNumber + " + " + secondNumber + " = ";
    }

    // returns the correct answer to the question
    public int correctAnswer()
    {
        return firstNumber + secondNumber;
    }
}