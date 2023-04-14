/*
* Write a program to find the word "bomb" in the given string (not case-sensitive).
* If found, print "Run!!!", otherwise, print "There is no bomb, relax."
* Example output:
        Enter a sentence: There is a bomb.
        Output: Run!!!

        Enter a sentence: Hey, did you think there is a bomb?
        Output: Run!!!

        Enter a sentence: This goes boom!!!
        Output: There is no bomb, relax.
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class BombSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String searchString = "Bomb".toLowerCase();

        System.out.print("Output: ");

        if (sentence.contains(searchString))
            System.out.print("Run!!!");
        else
            System.out.print("There is no bomb, relax.");
    }
}
