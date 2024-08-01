public class OddNumberExceptionDemo {

    public static void main(String[] args) {
        try {
            int number = 7; // Replace with any integer you'd like to check
            checkIfEven(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.err.println(e.getMessage());
        }
    }

    static void checkIfEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
