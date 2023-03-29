package com.apatelia.Conditions;

import java.util.Scanner;

public class OneToNine_Nested_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        if (number > 9 || number < 1)
            System.out.println("OTHER");
        else {
            if (number == 1)
                System.out.println("ONE");
            else if (number == 2) {
                System.out.println("TWO");
            } else if (number == 3) {
                System.out.println("THREE");
            } else if (number == 4) {
                System.out.println("FOUR");
            } else if (number == 5) {
                System.out.println("FIVE");
            } else if (number == 6) {
                System.out.println("SIX");
            } else if (number == 7) {
                System.out.println("SEVEN");
            } else if (number == 8) {
                System.out.println("EIGHT");
            } else {
                System.out.println("NINE");
            }
        }
    }
}
