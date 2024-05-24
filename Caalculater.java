

import java.util.Scanner;

public class Caalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Choose an Options \n 1. addition \n 2. subtraction  \n 3. multiplacation \n 4. division  ");
        int Option = scanner.nextInt();

        switch (Option) {
            case 1:
                System.out.println("Result: " + add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Result: " + subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Result: " + multiply(firstNumber, secondNumber));
                break;
            case 4:
                if (secondNumber != 0) {
                    System.out.println("Result: " + divide(firstNumber, secondNumber));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                break;
        }
        
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
