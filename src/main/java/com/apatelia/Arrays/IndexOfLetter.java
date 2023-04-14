/*
* Write a program which takes a String as an input from user,
* then asks user for a letter to search for, within the String that user provided.
* The program should find the index of the letter in the String and print it.
* If the letter is not found in the String, then the program should print "X does not exist in the word ABC".
* In case of multiple occurrences of a letter, the program should print the index of the first occurrence.
* For example,
        Enter a word: happy
        Enter a letter to search from the above word: p

        'p' is at the index 2 in the word 'happy'.

        Enter a word: happy
        Enter a letter to search from the above word: d

        'd' does not exist in the word 'happy'.
*/

package com.apatelia.Arrays;

import java.util.Scanner;

public class IndexOfLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word/sentence: ");
        String word = scanner.nextLine();

        System.out.print("Enter a letter to search from the above word/sentence: ");
        char letter = scanner.next().charAt(0);

        scanner.close();

        // Find the index of the letter in the word.
        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
                break;      // Break the loop after finding the first occurrence.
            }
        }

        // Another simple way to find the index of a letter.
        // int index = word.indexOf(letter);

        if (index == -1)
            System.out.println("'" + letter + "' does not exist in the word/sentence '" + word + "'.");
        else
            System.out.println("'" + letter + "' is at the index " + index + " in the word/sentence '" + word + "'.");
    }
}
