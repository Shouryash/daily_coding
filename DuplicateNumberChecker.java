//3. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
import java.util.*;

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of integers: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.println("Enter " + n + " integers:");
            Set<Integer> numberSet = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (!numberSet.add(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
            }

            System.out.println("No duplicates found. All numbers are unique!");
        } catch (DuplicateNumberException e) {
            System.err.println(e.getMessage());
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

