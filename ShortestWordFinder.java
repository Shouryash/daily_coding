public class ShortestWordFinder {

    public static String findShortestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String shortestWord = words[0];
        
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        
        return shortestWord;
    }

    public static void main(String[] args) {
        String testSentence = "Find the shortest word in this sentence";
        System.out.println("Shortest word: " + findShortestWord(testSentence));
    }
}
