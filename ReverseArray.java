//Write a Java program to Reverse an Array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 15 };

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reversed array:");
        printArray(arr);
    }

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
