//4. Write a Java Program to count the number of words in a String without using the Predefined method?

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with multiple words";
        int wordCount = countWords(inputString);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String input) {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter (part of a word)
            if (Character.isLetter(ch)) {
                if (!insideWord) {
                    // Entering a new word
                    count++;
                    insideWord = true;
                }
            } else {
                // Not a letter (space or punctuation)
                insideWord = false;
            }
        }

        return count;
    }
}
