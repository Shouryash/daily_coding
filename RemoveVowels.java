//1. Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

//Sample Input: COMPUTER APPLICATIONS

Sample Output: CMPTR PPLCTNS
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or a string: ");
        String input = scanner.nextLine();

        String result = removeVowels(input);
        System.out.println("New string after removing vowels: " + result);

        scanner.close();
    }

    // Function to remove vowels from a string
    private static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
