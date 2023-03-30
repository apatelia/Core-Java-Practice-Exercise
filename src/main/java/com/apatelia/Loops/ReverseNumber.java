/*
* Write a program to extract every single digit from a number, in the reverse order.
* For example, if the int is 54321, the output should be "1 2 3 4 5", with a space separating the digits.
* Use "while" loop.
* OPTIONAL: Save the reversed number in a separate variable and then print it at the end.
*/

package com.apatelia.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            System.out.print(lastDigit + " ");
            reversedNumber = (reversedNumber * 10) + lastDigit;

            number = number / 10;
        }

        System.out.println(System.lineSeparator() + "Reversed number is: " + reversedNumber);
    }
}
