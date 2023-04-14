/*
* Write a program to reverse an array and save the reversed values in a new array.
* If original array is [ 1, 2, 3, 4 ], then the reversed array will be [ 4, 3, 2, 1 ].
* Example output:
        Enter the number of items in array: 4
        Enter the value of all items (separated by space): 1 2 3 4
        Reversed array is: [ 4, 3, 2, 1 ]
*/

package com.apatelia.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in array: ");
        final int LENGTH = scanner.nextInt();

        int[] originalArray = new int[LENGTH];

        System.out.print("Enter the value of all items (separated by space): ");

        for (int i = 0; i < LENGTH; i++) {
            originalArray[i] = scanner.nextInt();
        }

        scanner.close();

        // Reverse the array and save it in another array.
        int[] reversedArray = new int[LENGTH];
        int rIndex = 0;

        for (int oIndex = LENGTH - 1; oIndex >= 0; oIndex--)
            reversedArray[rIndex++] = originalArray[oIndex];

        // Print reversed array.
        System.out.print("Reversed array is: [ ");

        for (int i = 0; i < LENGTH; i++) {
            if (i == LENGTH - 1)
                System.out.print(reversedArray[i]);
            else
                System.out.print(reversedArray[i] + ", ");
        }

        System.out.print(" ]");
    }
}
