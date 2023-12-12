import java.util.*;

public class PopularCategory {
	public String popular(String words, String categories) {
		String[] wordList = words.split(" ");
		String[] categoryList = categories.split(" ");

		Map<String, List<String>> categoryWordsMap = new HashMap<>();
		for (int i = 0; i < wordList.length; i++) {
			String word = wordList[i];
			String category = categoryList[i];
			if (!categoryWordsMap.containsKey(category)) {
				categoryWordsMap.put(category, new ArrayList<>());
			}
			categoryWordsMap.get(category).add(word);
		}

		int maxWordCount = 0;
		String popularCategory = "";
		for (Map.Entry<String, List<String>> entry : categoryWordsMap.entrySet()) {
			if (entry.getValue().size() > maxWordCount) {
				maxWordCount = entry.getValue().size();
				popularCategory = entry.getKey();
			} else if (entry.getValue().size() == maxWordCount) {
				if (entry.getKey().compareTo(popularCategory) < 0) {
					popularCategory = entry.getKey();
				}
			}
		}

		Collections.sort(categoryWordsMap.get(popularCategory));
		return String.join(" ", categoryWordsMap.get(popularCategory));
	}
}