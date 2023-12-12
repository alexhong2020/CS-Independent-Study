import java.util.*;

public class WordChoices {
	public String determine(String phrase1, String phrase2, String phrase3, String phrase4) {
		Set<String> wordsInPhrase2 = new HashSet<>(Arrays.asList(phrase2.split(" ")));
		Set<String> wordsInPhrase3 = new HashSet<>(Arrays.asList(phrase3.split(" ")));
		Set<String> wordsInPhrase4 = new HashSet<>(Arrays.asList(phrase4.split(" ")));

		Set<String> wordsMeetingCriteria = new HashSet<>(wordsInPhrase2);
		wordsMeetingCriteria.retainAll(wordsInPhrase3);
		wordsMeetingCriteria.retainAll(wordsInPhrase4);
		
		Set<String> wordsNotInPhrase1 = new HashSet<>(wordsMeetingCriteria);
		wordsNotInPhrase1.removeAll(Arrays.asList(phrase1.split(" ")));

		List<String> sortedWords = new ArrayList<>(wordsNotInPhrase1);
		Collections.sort(sortedWords);
		
		return String.join(" ", sortedWords);
	}
}