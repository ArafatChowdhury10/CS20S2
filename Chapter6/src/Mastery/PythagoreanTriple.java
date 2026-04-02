/*

Program: PythagoreanTriple.java          Last Date of this Revision: April 1, 2026

Purpose: An application that displays all Pythagorean Triples of a and b that are less than 100

Author: Arafat Chowdhury
School: CHHS
Course: Computer Programming 20

*/
package Mastery;

public class PythagoreanTriple 
{
    public static void main(String[] args) 
    {
        // Loop through all possible values of a from 1 to 100
        for (int a = 1; a <= 100; a++)
        
            // Loop through all possible values of b from 1 to 100
            for (int b = 1; b <= 100; b++)
            {
                // Calculate a^2 + b^2
                int sum = a * a + b * b;

                // Check if the sum is a perfect square
                if (PerfectSquare(sum))
                {
                    // If it is, find c by taking the square root
                    int c = (int)Math.sqrt(sum);

                    // Display the Pythagorean triple
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                }
            }
    }

    // Method to check if a number is a perfect square
    public static boolean PerfectSquare(int number)
    {
        // Find the square root of the number
        int sqrt = (int)Math.sqrt(number);

        // Check if squaring the root gives the original number
        return sqrt * sqrt == number;
    }
}
/* Screen Dump

a = 3, b = 4, c = 5
a = 4, b = 3, c = 5
a = 5, b = 12, c = 13
a = 6, b = 8, c = 10
a = 7, b = 24, c = 25
a = 8, b = 6, c = 10
a = 8, b = 15, c = 17
a = 9, b = 12, c = 15
a = 9, b = 40, c = 41
a = 10, b = 24, c = 26
a = 11, b = 60, c = 61
a = 12, b = 5, c = 13
a = 12, b = 9, c = 15
a = 12, b = 16, c = 20
a = 12, b = 35, c = 37
a = 13, b = 84, c = 85
a = 14, b = 48, c = 50
a = 15, b = 8, c = 17
a = 15, b = 20, c = 25
a = 15, b = 36, c = 39
a = 16, b = 12, c = 20
a = 16, b = 30, c = 34
a = 16, b = 63, c = 65
a = 18, b = 24, c = 30
a = 18, b = 80, c = 82
a = 20, b = 15, c = 25
a = 20, b = 21, c = 29
a = 20, b = 48, c = 52
a = 20, b = 99, c = 101
a = 21, b = 20, c = 29
a = 21, b = 28, c = 35
a = 21, b = 72, c = 75
a = 24, b = 7, c = 25
a = 24, b = 10, c = 26
a = 24, b = 18, c = 30
a = 24, b = 32, c = 40
a = 24, b = 45, c = 51
a = 24, b = 70, c = 74
a = 25, b = 60, c = 65
a = 27, b = 36, c = 45
a = 28, b = 21, c = 35
a = 28, b = 45, c = 53
a = 28, b = 96, c = 100
a = 30, b = 16, c = 34
a = 30, b = 40, c = 50
a = 30, b = 72, c = 78
a = 32, b = 24, c = 40
a = 32, b = 60, c = 68
a = 33, b = 44, c = 55
a = 33, b = 56, c = 65
a = 35, b = 12, c = 37
a = 35, b = 84, c = 91
a = 36, b = 15, c = 39
a = 36, b = 27, c = 45
a = 36, b = 48, c = 60
a = 36, b = 77, c = 85
a = 39, b = 52, c = 65
a = 39, b = 80, c = 89
a = 40, b = 9, c = 41
a = 40, b = 30, c = 50
a = 40, b = 42, c = 58
a = 40, b = 75, c = 85
a = 40, b = 96, c = 104
a = 42, b = 40, c = 58
a = 42, b = 56, c = 70
a = 44, b = 33, c = 55
a = 45, b = 24, c = 51
a = 45, b = 28, c = 53
a = 45, b = 60, c = 75
a = 48, b = 14, c = 50
a = 48, b = 20, c = 52
a = 48, b = 36, c = 60
a = 48, b = 55, c = 73
a = 48, b = 64, c = 80
a = 48, b = 90, c = 102
a = 51, b = 68, c = 85
a = 52, b = 39, c = 65
a = 54, b = 72, c = 90
a = 55, b = 48, c = 73
a = 56, b = 33, c = 65
a = 56, b = 42, c = 70
a = 56, b = 90, c = 106
a = 57, b = 76, c = 95
a = 60, b = 11, c = 61
a = 60, b = 25, c = 65
a = 60, b = 32, c = 68
a = 60, b = 45, c = 75
a = 60, b = 63, c = 87
a = 60, b = 80, c = 100
a = 60, b = 91, c = 109
a = 63, b = 16, c = 65
a = 63, b = 60, c = 87
a = 63, b = 84, c = 105
a = 64, b = 48, c = 80
a = 65, b = 72, c = 97
a = 66, b = 88, c = 110
a = 68, b = 51, c = 85
a = 69, b = 92, c = 115
a = 70, b = 24, c = 74
a = 72, b = 21, c = 75
a = 72, b = 30, c = 78
a = 72, b = 54, c = 90
a = 72, b = 65, c = 97
a = 72, b = 96, c = 120
a = 75, b = 40, c = 85
a = 75, b = 100, c = 125
a = 76, b = 57, c = 95
a = 77, b = 36, c = 85
a = 80, b = 18, c = 82
a = 80, b = 39, c = 89
a = 80, b = 60, c = 100
a = 80, b = 84, c = 116
a = 84, b = 13, c = 85
a = 84, b = 35, c = 91
a = 84, b = 63, c = 105
a = 84, b = 80, c = 116
a = 88, b = 66, c = 110
a = 90, b = 48, c = 102
a = 90, b = 56, c = 106
a = 91, b = 60, c = 109
a = 92, b = 69, c = 115
a = 96, b = 28, c = 100
a = 96, b = 40, c = 104
a = 96, b = 72, c = 120
a = 99, b = 20, c = 101
a = 100, b = 75, c = 125
 
 */