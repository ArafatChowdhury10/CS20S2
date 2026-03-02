package Mastery;

import java.util.Scanner;

public class DivAndMod {

	public static void main(String[] args) 
	{
		int division;
		int remainder;
		int division2;
		int remainder2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int firstNumber = input.nextInt();
		
		System.out.print("Enter a second integer: ");
		
		int secondNumber = input.nextInt();
		
		division = firstNumber / secondNumber;
		
		remainder = firstNumber % secondNumber;
		
		division2 = secondNumber / firstNumber;
		
		remainder2 = secondNumber % firstNumber;
		
		
		System.out.println(firstNumber + " / " + secondNumber + " = " + division);
		System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
		System.out.println("  ");
		System.out.println(secondNumber + " / " + firstNumber + " = " + division2);
		System.out.println(secondNumber + " % " + firstNumber + " = " + remainder2);
	}

}
