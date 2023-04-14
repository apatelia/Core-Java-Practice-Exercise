/*
* Write a program that prompts user for a word,
* checks if the word is a palindrome or not,
* and prints ""xxx" is/is not a palindrome".
* A word that reads the same backward as forward is called a palindrome.
* Examples of palindrome are: "mom", "dad", "madam", and "radar" etc.
* Example output:
            Enter a word: mom
            'mom' is a palindrome.

            Enter a word: mother
            'mother' is not a palindrome.
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();
        scanner.close();

        char[] userInput = word.toCharArray();
        char[] reversedWord = new char[userInput.length];
        int rIndex = 0;

        // Find out the reversed word.
        for (int i = userInput.length - 1; i >= 0; i--) {
            reversedWord[rIndex++] = userInput[i];
        }

        // Check if the word is a palindrome or not.
        boolean isPalindrome = true;

        for (int i = 0; i < reversedWord.length; i++) {
            if (reversedWord[i] != userInput[i]) {
                isPalindrome = false;
                break;
            }
        }

        // Print the output message.
        if (isPalindrome)
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");
    }
}
