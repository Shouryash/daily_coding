//Write a Java program to find the number of even and odd integers in a given array of integers.

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 15, 7, 12 };

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }
}
