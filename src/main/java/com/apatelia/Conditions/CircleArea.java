package com.apatelia.Conditions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final float PI = 3.14f; // Since the value of PI never changes, we take it as a final.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle's radius: ");
        int radius = scanner.nextInt();

        float area = 2 * PI * radius;

        System.out.println("Area of the circle with radius " + radius + " = " + area);
    }
}
