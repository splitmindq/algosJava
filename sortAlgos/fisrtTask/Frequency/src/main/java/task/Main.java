package task;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            words.add(line);
        }

        Map<String, Integer> wordFrequency = new HashMap<>();

        Set<String> wordSet = new HashSet<>();

        for (String word : words) {
            if (wordSet.add(word)) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = ReverseOrderSort.sort(wordFrequency);
        logger.info(entries.toString());

    }
}