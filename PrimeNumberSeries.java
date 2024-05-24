
import java.util.Scanner;

public class PrimeNumberSeries {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }
        return true; // number is prime
    }

    // Method to print prime numbers up to a given limit
    public static void printPrimeNumbers(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit to print prime numbers: ");
        int limit = scanner.nextInt();

        printPrimeNumbers(limit);

        scanner.close();
    }
}
