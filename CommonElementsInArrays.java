//Write a Java program to find common elements between two arrays (string values)

import java.util.HashSet;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        String[] arr1 = { "apple", "banana", "orange", "grape" };
        String[] arr2 = { "banana", "grape", "kiwi", "pear" };

        HashSet<String> set1 = new HashSet<>();
        for (String s : arr1) {
            set1.add(s);
        }

        HashSet<String> commonElements = new HashSet<>();
        for (String s : arr2) {
            if (set1.contains(s)) {
                commonElements.add(s);
            }
        }

        if (commonElements.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements:");
            for (String s : commonElements) {
                System.out.println(s);
            }
        }
    }
}
