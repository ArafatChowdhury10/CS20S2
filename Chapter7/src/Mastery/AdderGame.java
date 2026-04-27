/*

Program: AdderGame.java          Last Date of this Revision: April 27, 2026

Purpose: An object that represents one single math problem.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

import java.util.Scanner;
import java.util.Random;

public class AdderGame 
{
	private int score;
	private Scanner input;
	
	public AdderGame()
	{
		score = 0; 
		input = new Scanner(System.in);
	}
	
	public void startGame()
	{
		while(true)
		{
			Question question = new Question();
			int tries = 0;
			int answer = input.nextInt();
			int correct = question.correctAnswer();
			while(tries < 3)
			{
				if (answer != correct)
					System.out.println("Incorrect answer please try again");
				if (answer == correct)
				{
					if (tries == 0)
					{
						score += 5;
					}
					else if (tries == 1)
					{
						score += 3;
					}
					else
						score += 1;
					
					
				}
				if (answer == 999)
				{
					System.out.println("Your score is " + score);
				}
			}
		}
	}
}
/* Screen Dump

Paste the output of your code here
 
 */
