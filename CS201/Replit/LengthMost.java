import java.util.*;

public class LengthMost {
	public String count(String phrase) {
		String[] words = phrase.split(" ");
		Map<Integer, Integer> wordLengthCounts = new HashMap<>();
		int maxCount = 0;
		for (String word : words) {
			int length = word.length();
			wordLengthCounts.put(length, wordLengthCounts.getOrDefault(length, 0) + 1);
			maxCount = Math.max(maxCount, wordLengthCounts.get(length));
		}

		List<Integer> maxWordLengths = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
			if (entry.getValue() == maxCount) {
				maxWordLengths.add(entry.getKey());
			}
		}
		Collections.sort(maxWordLengths);

		StringBuilder result = new StringBuilder();
		result.append(maxCount).append(":");
		for (int i = 0; i < maxWordLengths.size(); i++) {
			result.append(maxWordLengths.get(i));
			if (i < maxWordLengths.size() - 1) {
				result.append("-");
			}
		}
		return result.toString();
	}
}