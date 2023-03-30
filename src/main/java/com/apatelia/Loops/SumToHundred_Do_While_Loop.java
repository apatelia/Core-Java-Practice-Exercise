/*
* Write a program to calculate the sum of 1, 2, 3, ..., to 100.
* Store 1 and 100 in two variables named "lowerbound" and "upperbound" respectively,
* so that we can change their values easily.
* Use a "do-while" loop.
*/

package com.apatelia.Loops;

public class SumToHundred_Do_While_Loop {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;

        int sum = 0;
        int currentNumber = lowerBound;

        do {
            sum += currentNumber; // This is same as writing `sum = sum + currentNumber;`

            currentNumber++;
        } while (currentNumber <= upperBound);

        System.out.println("Sum of " + lowerBound + " to " + upperBound + " is " + sum);
    }
}
