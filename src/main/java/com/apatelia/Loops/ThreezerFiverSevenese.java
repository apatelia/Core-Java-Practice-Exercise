/*
* Write a program which prints the numbers 1 to 110, 11 numbers per line.
* The program shall print "Threezer" in place of the numbers which are multiples of 3,
* "Fiver" for multiples of 5, "Sevenese" for multiples of 7,
* "ThreezerFiver" for multiples of 3 and 5, "ThreezerSevenese" for multiples of 3 and 7
* and "FiverSevenese" for multiples of 5 and 7.
* The output should look like:
 1 2 Threezer 4 Fiver Threezer Sevenese 8 Threezer Fiver 11
 Threezer 13 Sevenese ThreezerFiver 16 17 Threezer 19 Fiver ThreezerSevenese 22
 23 Threezer Fiver 26 Threezer Sevenese 29 ThreezerFiver 31 32 Threezer
 34 FiverSevenese Threezer 37 38 Threezer Fiver 41 ThreezerSevenese 43 44
 ......
*/

package com.apatelia.Loops;

public class ThreezerFiverSevenese {
    public static void main(String[] args) {
        int start = 1;
        int end = 110;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("ThreezerFiver ");
            else if (i % 3 == 0 && i % 7 == 0)
                System.out.print("ThreezerSevenese ");
            else if (i % 5 == 0 && i % 7 == 0)
                System.out.print("FiverSevenese ");
            else if (i % 3 == 0)
                System.out.print("Threezer ");
            else if (i % 5 == 0)
                System.out.print("Fiver ");
            else if (i % 7 == 0)
                System.out.print("Sevenese ");
            else
                System.out.print(i + " ");

            if (i % 11 == 0)
                System.out.print(System.lineSeparator());
        }
    }
}
