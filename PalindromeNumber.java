import java.util.Scanner;

public class PalindromeNumber {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        int remainder;

        // Reverse the given number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Check if original number is equal to its reverse
        return originalNumber == reversedNumber;
    }

    // Method to print all palindrome numbers within a given range
    public static void printPalindromeNumbers(int start, int end) {
        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range to print palindrome numbers:");
        System.out.print("Start: ");
        int start = scanner.nextInt();
        System.out.print("End: ");
        int end = scanner.nextInt();

        printPalindromeNumbers(start, end);

        scanner.close();
    }
}
