/*
*  Write a program to concatenate 2 strings.
*  Given two strings, `firstName` and `lastName`,
*  program should join them together in a new string `fullName` with a space in between.
*  Do not use `+` operator.
*  Output:
        Enter first name: John
        Enter last name: Adams

        Full name is John Adams.
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the last name: ");
        String lastName = scanner.next();
        scanner.close();

        // Concatenate the strings, with a space in between.
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(System.lineSeparator() + "Full name is " + fullName + ".");
    }
}
