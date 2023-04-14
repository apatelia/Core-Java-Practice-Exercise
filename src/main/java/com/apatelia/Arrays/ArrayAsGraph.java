/*
* Write a program which prompts user for the number of items in an array (a non-negative integer),
* and saves it in an int variable called numberOfItems.
* It then prompts user for the values of all the items (non-negative integers) and saves them in an int array called `items`.
* The program should then print the contents of the array in a graphical form, with the array index and values represented by number of stars.
* For example,
        Enter the number of items in array: 5
        Enter the value of all items (separated by space): 7 4 3 0 7
        0: *******(7)
        1: ****(4)
        2: ***(3)
        3: (0)
        4: *******(7)
*/

package com.apatelia.Arrays;

import java.util.Scanner;

public class ArrayAsGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in array: ");
        final int numberOfItems = scanner.nextInt();

        int[] items = new int[numberOfItems];

        System.out.print("Enter the value of all items (separated by space): ");

        for (int i = 0; i < numberOfItems; i++) {
            items[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < numberOfItems; i++) {

            System.out.print(i + ": ");

            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }

            System.out.print("(" + items[i] + ")");
            System.out.print(System.lineSeparator());
        }
    }
}
