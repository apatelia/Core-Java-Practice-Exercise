package com.apatelia.Conditions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is an " + evenOrOdd + " number.");
    }
}
