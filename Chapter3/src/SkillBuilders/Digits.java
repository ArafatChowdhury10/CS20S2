package SkillBuilders;

import java.util.Scanner;

public class Digits {
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a two digit number: ");
		int twoDigitnumber = input.nextInt();
		
		int tensPlace = twoDigitnumber / 10;
		int onesPlace = twoDigitnumber % 10;

		System.out.println("The tens place is: " + tensPlace);
		System.out.println("The ones place is: " + onesPlace);
		
	}

}
