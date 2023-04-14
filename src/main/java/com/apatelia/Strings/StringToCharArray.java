/*
*  Write a program to read a String from user input and convert this String into a Char array.
*  Print each char from the Char array in a new line. For example,
    Enter a string: abc

    Output:
    a
    b
    c
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word/sentence: ");
        String str = scanner.nextLine();
        scanner.close();

        // Convert the string to a Char array.
        char[] charArray = str.toCharArray();

        // Print each char from the Char array in a new line.
        System.out.println(System.lineSeparator() + "Output:");
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
