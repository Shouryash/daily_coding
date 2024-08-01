public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will throw an exception
            System.out.println("Result: " + result); // This won't be executed
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
        }
    }
}
