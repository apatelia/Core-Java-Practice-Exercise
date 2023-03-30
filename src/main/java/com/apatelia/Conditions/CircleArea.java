/*
* Write a program which calculates and prints the area of a circle,
* when the value of the variable radius is provided.
* Try radius = 0, 1, 7, 12, 25, 59, 64, 88 and verify your results.
* Use below formula to calculate the area.
* Area = 2 x PI x radius
*/

package com.apatelia.Conditions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final float PI = 3.14f; // Since the value of PI never changes, we take it as a final.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle's radius: ");
        int radius = scanner.nextInt();

        scanner.close();

        float area = 2 * PI * radius;

        System.out.println("Area of the circle with radius " + radius + " = " + area);
    }
}
