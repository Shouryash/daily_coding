

	
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] originalArray = { 10, 20, 40, 20, 30, 10 };

        // Create a new array to store unique elements
        int[] uniqueArray = removeDuplicates(originalArray);

        // Print the modified array without duplicates
        System.out.println("Array without duplicates:");
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
    }

    // Function to remove duplicates and return a new array
    private static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int resultIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < resultIndex; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        // Resize the array to remove unused slots
        return java.util.Arrays.copyOf(result, resultIndex);
    }
}
