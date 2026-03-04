package SkillBuilders;

import java.util.Scanner;

public class GradeAvg_Part2 
{

	public static void main(String[] args) 
	{
		int sum;

		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the grade of your first class: %");
		sum =+ input.nextInt();
		
		System.out.print("What is the grade of your second class: %");
		sum +=  input.nextInt();
		
		System.out.print("What is the grade of your third class: %");
		sum += input.nextInt();		
		
		System.out.print("What is the grade of your fourth class: %");
		sum += input.nextInt();		
		
		System.out.print("What is the grade of your fifth class: %");
		sum += input.nextInt();	
		
		int average = sum / 5;
		
		System.out.println("The average of your grades is: %" + average);
	}

}
