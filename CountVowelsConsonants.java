// 2. How do you count a number of vowels and consonants in a given string?

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String inputString = "Great responsibility"; // Replace with your desired input string
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is an alphabet (excluding spaces)
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
