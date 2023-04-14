/*
* Write a program which prompts user for the number of students in a class (a non-negative integer),
* and saves it in an int variable called numberOfStudents.
* It then prompts user for the grade of each of the students (integer between 0 to 100) and saves them in an int array called grades.
* The program shall then compute and print the average (in double rounded to 2 decimal places) and minimum/maximum (in int).
* For example,
        Enter the number of students: 5
        Enter the grade for student 1: 98
        Enter the grade for student 2: 78
        Enter the grade for student 3: 78
        Enter the grade for student 4: 87
        Enter the grade for student 5: 76
        The average is: 83.40
        The minimum is: 76
        The maximum is: 98
*/

package com.apatelia.Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        final int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        scanner.close();

        // Calculate average.
        int sumOfGrades = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            sumOfGrades = sumOfGrades + grades[i];
        }

        float average = (float) sumOfGrades / numberOfStudents;

        // Use printf() for 2 decimal point formatting of average.
        System.out.printf("The average is: %.2f \n", average);

        // Find minimum and maximum of grades.
        int minimum = 100, maximum = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            if ( grades[i] <= minimum)
                minimum = grades[i];

            if (grades[i] >= maximum)
                maximum = grades[i];
        }

        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }
}
