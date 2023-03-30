/*
* Write a program to calculate the factorial of a given number n.
* Use a "for" loop.
*/

package com.apatelia.Loops;

import java.util.Scanner;

public class Factorial_For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
