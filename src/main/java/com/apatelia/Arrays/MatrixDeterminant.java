/*
* Create a function to calculate the determinant of a '2 x 2' matrix.
* The determinant of the following matrix [[a, b], [c, d]] is: 'ad - bc'
* For example,
        Enter a number for a: 1
        Enter a number for b: 2
        Enter a number for c: 3
        Enter a number for d: 4
        Matrix:
        [ 1 2 ]
        [ 3 4 ]
        The determinant is: -2
*/

package com.apatelia.Arrays;

import java.util.Scanner;

public class MatrixDeterminant {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        char[][] symbols = { {'a', 'b'}, {'c', 'd'} };

        // Print matrix format to show user.
        System.out.println("Matrix Format: ");
        System.out.println("[ a b ]");
        System.out.println("[ c d ]");

        // Get values for matrix from the user.
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print("Enter a number for " + symbols[row][col] + ": ");
                matrix[row][col] = scanner.nextInt();
            }
        }

        scanner.close();

        // Find the determinant.
        int determinant = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));

        // Print matrix.
        System.out.println(System.lineSeparator() + "Your Matrix: ");
        for (int row = 0; row < 2; row++) {
            System.out.println("[ " + matrix[row][0] + " " + matrix[row][1] + " ]");
        }

        System.out.println(System.lineSeparator() + "The determinant is: " + determinant);
    }
}
