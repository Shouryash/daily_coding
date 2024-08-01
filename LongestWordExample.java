//2. Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.

//Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN” Sample Output: The longest word: FOOTBALL: The length of the word: 8
import java.util.Scanner;

public class LongestWordExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); // Split the sentence into words

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLength);

        scanner.close();
    }
}
