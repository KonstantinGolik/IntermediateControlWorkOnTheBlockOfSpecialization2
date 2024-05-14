import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            String content = FileUtil.readFile(fileName);

            WordAnalyzer analyzer = new WordAnalyzer(content);

            int wordCount = analyzer.getWordCount();
            System.out.println("Количество слов: " + wordCount);

            String longestWord = analyzer.findLongestWord();
            System.out.println("Самое длинное слово: " + longestWord);

            Map<String, Integer> wordFrequency = analyzer.calculateWordFrequency();
            System.out.println("Частота слов:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}