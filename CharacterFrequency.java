//1. Write a program to print the frequency of each character in a String.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Ignore spaces and non-alphabetic characters
            if (Character.isLetter(ch)) {
                // Convert to lowercase for case-insensitivity
                ch = Character.toLowerCase(ch);

                // Update the frequency count
                charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
