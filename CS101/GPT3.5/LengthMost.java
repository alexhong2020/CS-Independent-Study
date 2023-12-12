import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthMost {
    public String count(String phrase) {
        // Split the phrase into words
        String[] words = phrase.split(" ");

        // Create a map to store word lengths and their counts
        Map<Integer, Integer> lengthCounts = new HashMap<>();

        // Iterate through the words and update the counts
        for (String word : words) {
            int length = word.length();
            lengthCounts.put(length, lengthCounts.getOrDefault(length, 0) + 1);
        }

        // Find the maximum count
        int maxCount = lengthCounts.values().stream().max(Integer::compareTo).orElse(0);

        // Collect the word lengths with the maximum count
        String result = lengthCounts.entrySet().stream()
            .filter(entry -> entry.getValue() == maxCount)
            .map(entry -> entry.getKey().toString())
            .sorted()
            .collect(Collectors.joining("-"));

        // Build the result string
        return maxCount + ":" + result;
    }
}
