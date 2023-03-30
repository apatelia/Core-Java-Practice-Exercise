/*
* Write a program to calculate the sum of 1, 2, 3, ..., to 100.
* Store 1 and 100 in two variables named "lowerbound" and "upperbound" respectively,
* so that we can change their values easily.
* Use a "while" loop.
*/

package com.apatelia.Loops;

public class SumToHundred_While_Loop {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;

        int sum = 0;
        int currentNumber = lowerBound;

        while (currentNumber <= upperBound) {
            sum += currentNumber; // This is same as writing `sum = sum + currentNumber;`

            currentNumber++;
        }

        System.out.println("Sum of " + lowerBound + " to " + upperBound + " is " + sum);
    }
}
