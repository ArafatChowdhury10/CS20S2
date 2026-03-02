package Mastery;

import java.util.Scanner;

public class Digits

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int threeDigitnumber = input.nextInt();
		{
           int hundredsPlace = threeDigitnumber / 100;
           int tensPlace = (threeDigitnumber / 10) % 10;
           int onesPlace = threeDigitnumber % 10;
          
   		System.out.println("The hundreds place digit is: " + hundredsPlace);
   		System.out.println("The tens place digit is: " + tensPlace);
   		System.out.println("The ones place digit is: " + onesPlace);
		}
		
	}
}
