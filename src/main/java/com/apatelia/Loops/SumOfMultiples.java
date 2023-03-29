package com.apatelia.Loops;

import java.util.Scanner;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        System.out.println("Sum of all the multiples of 3 and 5 up to " + number + " is:");

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;

                // Don't print '+' sign for the first number.
                // 3 will always be the first number.
                if (i == 3)
                    System.out.print("\t" + i);
                else
                    System.out.print(" + " + i);
            }
        }

        System.out.print(" = " + sum);
    }
}
