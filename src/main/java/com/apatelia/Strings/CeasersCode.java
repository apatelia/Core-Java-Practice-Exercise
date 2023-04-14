/*
* Write a program to encrypt a string using Ceaser's code.
* In Ceaser's code, each letter in plaintext is replaced by a another letter in the alphabet.
* For our program, let's consider the replacement of a = a + 3, which means that we should replace an 'a' by 'd', 'b' by 'e' and so on.
* 'x' will be replaced by 'a', 'y' by 'b' and 'z' by 'c'.
* To keep things simple, ciphertext should be printed in uppercase only.
* To obtain a char value, you need to perform explicit type casting using (char)('A' + 3).
* Example output:
        Enter a plaintext string: Testing
        The ciphertext string is: WHVWLQJ
*/

package com.apatelia.Strings;

import java.util.Scanner;

public class CeasersCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String plainText = scanner.nextLine();
        scanner.close();

        System.out.print("The ciphertext string is: ");

        for (int i = 0; i < plainText.length(); i++) {
            char letter = plainText.charAt(i);

            switch (Character.toUpperCase(letter)) {
                case 'X' -> System.out.print("A");
                case 'Y' -> System.out.print("B");
                case 'Z' -> System.out.print("C");
                default -> {
                    char cipheredLetter = (char) (letter + 3);
                    System.out.print(Character.toUpperCase(cipheredLetter));
                }
            }
        }
    }
}
