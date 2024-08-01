public class EvenOddPrinter {
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printEvenNumbers());
        Thread oddThread = new Thread(() -> printOddNumbers());

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join(); // Wait for evenThread to finish
            oddThread.join();  // Wait for oddThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed.");
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
