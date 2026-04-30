/*

Program: AdderGame.java          Last Date of this Revision: April 29, 2026

Purpose: An object that manages and runs the addition game which generates questions, 
handling user input, tracking attempts, and keeping score.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;
import java.util.Scanner;
import java.util.Random;

public class AdderGame
{
    private int score;        // keeps track of the player's total score
    private Scanner input;    // used to read user input from the keyboard
    
    public AdderGame()
    {
        score = 0;                  // initialize score to 0
        input = new Scanner(System.in); // create Scanner object
    }
    
    // starts and controls the game loop
    public void startGame()
    {
        while(true) // runs continuously until user enters 999
        {
            Question question = new Question(); // create a new random question
            int tries = 0;                      // number of attempts for current question
            int correct = question.correctAnswer(); // get correct answer
            System.out.print(question.getQuestion()); // display the question
            
            // allow up to 3 tries
            while(tries < 3)
            {
                int answer = input.nextInt(); // read user's answer
                
                // check if user wants to quit
                if (answer == 999)
                {
                    System.out.print("Your score is " + score); // display final score
                    return; // exit the game
                }
                
                // check if answer is correct
                if (answer == correct)
                {
                    // award points based on number of tries
                    if (tries == 0)
                    {
                        score += 5; // first try
                    }
                    else if (tries == 1)
                    {
                        score += 3; // second try
                    }
                    else
                        score += 1; // third try
                    
                    break; // move to next question
                }
                else
                    tries++; // increase attempt count
                
                // if answer is wrong and tries remain
                if (tries < 3)
                {
                    System.out.print("Wrong answer. Enter another answer: ");
                }
                else
                {
                    // after 3 incorrect tries
                    System.out.println("No points. Correct answer is: " + correct);
                }
            }
        }
    }
}


