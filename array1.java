public class array1 {
    public static void main(String args[]) {
    
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = {100, 200, 300, 400, 500};
        int sum[] = new int[arr.length]; // Create an array to store the sum
        
        // Print the original arrays
        System.out.println("Array 1:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
        System.out.println("\nArray 2:");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");    
        }
        
        // Add the elements of both arrays
        System.out.println("\nSum of both arrays:");
        for(int i = 0; i < arr.length; i++) {
            sum[i] = arr[i] + arr2[i];
            System.out.print(sum[i] + " ");    
        }
        
        
    }
}
