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
