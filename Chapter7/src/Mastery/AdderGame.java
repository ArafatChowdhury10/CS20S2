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
			int user = input.nextInt();
			while(tries < 3)
			{
				if (user == 999)
				{
					System.out.println("Your score is " + score);
				}
			}
		}
	}
}
