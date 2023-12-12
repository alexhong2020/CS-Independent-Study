import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : data) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<String> uniqueWords = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(uniqueWords);

        int[] frequencies = new int[uniqueWords.size()];
        for (int i = 0; i < uniqueWords.size(); i++) {
            frequencies[i] = frequencyMap.get(uniqueWords.get(i));
        }

        return frequencies;
    }
}