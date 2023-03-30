/*
* Write a program which prints "Even Number" if a variable named “number” is even, or “Odd Number” otherwise.
* Use Ternary operator.
* Try number = 0, 1, 34, 79, -1, -2 and verify your results.
*/

package com.apatelia.Conditions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is an " + evenOrOdd + " number.");
    }
}
