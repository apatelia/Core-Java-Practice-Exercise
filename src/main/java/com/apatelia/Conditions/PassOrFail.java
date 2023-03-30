/*
* Write a program which prints "FAIL" if a variable named "mark" is less than 50; or prints "PASS" otherwise.
* The program should always print “DONE” before exiting.
* Try mark = 0, 49, 50, 51, 100 and verify your results.
*/


package com.apatelia.Conditions;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks(between 0 and 100): ");
        int mark = scanner.nextInt();

        if (mark < 0 || mark > 100)
            System.out.println("Invalid marks: " + mark);
        else if (mark < 50)
            System.out.println("FAIL: mark = " + mark);
        else
            System.out.println("PASS: mark = " + mark);

        System.out.println(System.lineSeparator() + "Done.");
    }
}
