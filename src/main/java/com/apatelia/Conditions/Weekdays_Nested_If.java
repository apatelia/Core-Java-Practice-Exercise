/*
* Write a program which prints “Sunday”, “Monday”, ... “Saturday”,
* if a variable named "dayNumber" is 0, 1, ..., 6, respectively.
* Otherwise, it should print "Not a valid day".
* Use a "nested-if" statement.
* Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
*/

package com.apatelia.Conditions;

import java.util.Scanner;

public class Weekdays_Nested_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number(0=Sunday, 1=Monday and so on): ");
        int dayNumber = scanner.nextInt();

        scanner.close();

        if (dayNumber > 6 || dayNumber < 0)
            System.out.println("Not a valid day.");
        else {
            if (dayNumber == 0)
                System.out.println("Sunday");
            else if (dayNumber == 1) {
                System.out.println("Monday");
            } else if (dayNumber == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }
        }
    }
}
