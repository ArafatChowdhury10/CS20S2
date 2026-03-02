package SkillBuilders;

import java.util.Scanner;

public class GradeAvg_Part1 
{

	public static void main(String[] args) 
	{
		
		int sum;

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the grade of your first class: ");
		int g1 = input.nextInt();
		
		System.out.print("What is the grade of your second class: ");
		int g2 = input.nextInt();
		
		System.out.print("What is the grade of your third class: ");
		int g3 = input.nextInt();		
		
		System.out.print("What is the grade of your fourth class: ");
		int g4 = input.nextInt();		
		
		System.out.print("What is the grade of your fifth class: ");
		int g5 = input.nextInt();	
		
		sum = g1 + g2 + g3 + g4 + g5;
		
		int average = sum / 5;
		
		System.out.println("The average of your grades is: " + average);
		
	}

}
