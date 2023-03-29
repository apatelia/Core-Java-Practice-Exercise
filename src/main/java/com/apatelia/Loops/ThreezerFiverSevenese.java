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
