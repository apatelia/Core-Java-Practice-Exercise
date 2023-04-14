/*
* Write a program to reverse the case of individual letters of a String.
* All lower-cased letters should be upper-cased, and vice versa.
* Example output:
        Enter a sentence: Happy Birthday

        Output: hAPPY bIRTHDAY
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class ReverseCaseOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        System.out.print("Output: ");

        for (int i = 0; i < sentence.length(); i++) {

            char letter = sentence.charAt(i);
            char outputLetter;

            if (Character.isUpperCase(letter))
                outputLetter = Character.toLowerCase(letter);
            else if (Character.isLowerCase(letter)) {
                outputLetter = Character.toUpperCase(letter);
            } else
                outputLetter = letter;

            System.out.print(outputLetter);
        }
    }
}
