/*
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.

phrases contains between 2 and 50 elements, inclusive.
Each element of phrases contains between 1 and 50 characters, inclusive.
Each element of phrases contains letters ('a'-'z' and 'A'-'Z') and spaces (' ') only.
Each element of phrases contains at least one letter.
*/

import java.util.*;

public class Aaagmnrs {
    // Helper function to compute the canonical form of a string
    private String getCanonicalForm(String s) {
        s = s.replaceAll(" ", "").toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public String[] anagrams(String[] phrases) {
        Map<String, String> canonicalToOriginal = new HashMap<>();
        List<String> uniquePhrases = new ArrayList<>();

        for (String phrase : phrases) {
            String canonicalForm = getCanonicalForm(phrase);
            // If the canonical form is not in the map, it's a unique phrase
            if (!canonicalToOriginal.containsKey(canonicalForm)) {
                canonicalToOriginal.put(canonicalForm, phrase);
                uniquePhrases.add(phrase);
            }
        }

        // Convert the list of unique phrases to an array
        String[] result = new String[uniquePhrases.size()];
        uniquePhrases.toArray(result);

        return result;
    }
}
