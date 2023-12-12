public class SwapParts {
	public String change(String phrase) {
		String[] words = phrase.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (word.length() <= 3) {
				result.append(word).append(" ");
			} else if (word.length() == 4 || word.length() == 5) {
				result.append(word + "ing").append(" ");
			} else {
				result.append(word.substring(word.length() - 3) + word.substring(3, word.length() - 3) + word.substring(0, 3)).append(" ");
			}
		}
		return result.toString().trim();
	}
}