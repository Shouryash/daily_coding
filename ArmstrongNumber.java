import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        return result == number;
    }

    // Method to print all Armstrong numbers within a given range
    public static void printArmstrongNumbers(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range to print Armstrong numbers:");
        System.out.print("Start: ");
        int start = scanner.nextInt();
        System.out.print("End: ");
        int end = scanner.nextInt();

        printArmstrongNumbers(start, end);
    }
}
