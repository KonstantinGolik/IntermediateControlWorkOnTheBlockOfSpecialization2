import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {
    private String[] words;

    public WordAnalyzer(String content) {
        this.words = content.split("\\s+");
    }

    public int getWordCount() {
        return words.length;
    }

    public String findLongestWord() {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public Map<String, Integer> calculateWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }
}