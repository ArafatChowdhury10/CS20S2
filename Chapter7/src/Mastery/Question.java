/*

Program: Question.java          Last Date of this Revision: April 21, 2026

Purpose: An object that represents one single math problem.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;
import java.util.Random;

public class Question 
{
    private int a;
    private int b;

    public Question()
    {
        a = (int)(Math.random() * 21);
        b = (int)(Math.random() * 21);
    }

    public String getQuestion()
    {
        return a + " + " + b + " = ";
    }

    public int correctAnswer()
    {
        return a + b;
    }

}
/* Screen Dump

Paste the output of your code here
 
 */