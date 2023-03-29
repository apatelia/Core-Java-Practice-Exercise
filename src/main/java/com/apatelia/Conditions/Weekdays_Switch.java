package com.apatelia.Conditions;

import java.util.Scanner;

public class Weekdays_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number(0=Sunday, 1=Monday and so on): ");
        int dayNumber = scanner.nextInt();

        // This is a new `switch` syntax, only available in JDK >= 13.
        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day.");
        }
    }
}
