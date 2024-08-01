// 3. Write a method that takes a String and
// returns a String of the same length containing the 'X' character in all positions except the last 4 positions.
// The characters in the last 4 positions must be the same as in the original string. 
//For example, if the argument is

public class LastFourX {
    public static void main(String[] args) {
        String originalString = "Hello, World!"; // Replace with your desired input string
        String modifiedString = replaceWithX(originalString);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String replaceWithX(String input) {
        if (input.length() <= 4) {
            // If the input string has 4 or fewer characters, return it unchanged
            return input;
        }

        // Create a StringBuilder to build the modified string
        StringBuilder result = new StringBuilder();

        // Append 'X' to all positions except the last 4
        for (int i = 0; i < input.length() - 4; i++) {
            result.append('X');
        }

        // Append the last 4 characters from the original string
        result.append(input.substring(input.length() - 4));

        return result.toString();
    }
}
