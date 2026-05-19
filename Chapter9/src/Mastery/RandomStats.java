/*

Program: RandomStats.java          Last Date of this Revision: May 13, 2026

Purpose: An application that generates 500 random numbers between 0 and 9, counts how many times each number occurs, and displays the results in a table.

Author: Arafat Chowdhury, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Random;

public class RandomStats {
    public static void main(String[] args) {

        Random rand = new Random();

        // Array to store occurrences of numbers 0–9
        int[] occurrences = new int[10];

        // Generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            int number = rand.nextInt(10); // Random number from 0 to 9
            occurrences[number]++;
        }

        // Display results
        System.out.println("Number Occurrences");

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(i + "\t" + occurrences[i]);
        }
    }
}
/* Screen Dump

Number	Occurrences
0		40
1		65
2		51
3		41
4		44
5		53
6		44
7		51
8		48
9		63
 
 */