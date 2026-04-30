/*

Program: Main.java          Last Date of this Revision: April 29, 2026

Purpose: A method that starts the program and runs the addition game.

Author: Arafat Chowdhury 
School: CHHS
Course: Computer Programming 20
 
*/
package Mastery;

public class Main
{
    // main method: entry point of the program
    public static void main(String[] args)
    {
        AdderGame game = new AdderGame(); // create an AdderGame object
        game.startGame();                 // start running the game
    }
}

/* Screen Dump

18 + 16 = 34
14 + 9 = 23
17 + 7 = 24
6 + 15 = 21
8 + 1 = 9
14 + 5 = 19
5 + 1 = 6
4 + 1 = 5
1 + 9 = 10
18 + 4 = 2
Wrong answer. Enter another answer: 32
Wrong answer. Enter another answer: 22
1 + 4 = 5
20 + 8 = 26
Wrong answer. Enter another answer: 23
Wrong answer. Enter another answer: 32
No points. Correct answer is: 28
5 + 1 = 999
Your score is 51
 
 */