/*
 * Write a program to calculate the factorial of a given number n.
 * Use a "while" loop.
*/

package com.apatelia.Loops;

import java.util.Scanner;

public class Factorial_While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int i = 1, factorial = 1;

        while (i <= n) {
            factorial = factorial * i;

            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
