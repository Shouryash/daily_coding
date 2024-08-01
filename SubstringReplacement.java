//2. Write a program replace a Substring in a String.
import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSubstring = scanner.nextLine();

        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Replace the old substring with the new substring
        String result = input.replace(oldSubstring, newSubstring);

        System.out.println("Modified string: " + result);

        scanner.close();
    }
}
