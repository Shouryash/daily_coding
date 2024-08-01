//3. Write a program to Convert String to Character Array.

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Print the character array
        System.out.println("Character array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
