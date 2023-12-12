import java.util.*;

class Main {
	public static void main(String[] args) {
		String[] phrases = {"Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote"};
		System.out.println(Arrays.toString(removeAnagrams(phrases)));
	}

	public static String[] removeAnagrams(String[] phrases) {
		String[] phrases2 = new String[phrases.length];
		for (int i = 0; i < phrases.length; i++) {
			phrases2[i] = phrases[i];
		}
		for (int i = 0; i < phrases.length; i++) {
			String phrase = phrases[i];
			for (int j = i + 1; j < phrases.length; j++) {
				if (phrase.length() == phrases[j].length() && isAnagram(phrase, phrases[j])) {
					phrases2[j] = "";
				}
			}
		}
		List<String> remainingPhrases = new ArrayList<>();
		for (String phrase : phrases2) {
			if (!phrase.isEmpty()) {
				remainingPhrases.add(phrase);
			}
		}
		return remainingPhrases.toArray(new String[remainingPhrases.size()]);
	}

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll(" ", "").toLowerCase();
		s2 = s2.replaceAll(" ", "").toLowerCase();
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		for (int c : count) {
			if (c != 0) {
				return false;
			}
		}
		return true;
	}
}