import java.util.Scanner;

public class Factorial {
    public static int factorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorialRecursive(number));
    }
}
