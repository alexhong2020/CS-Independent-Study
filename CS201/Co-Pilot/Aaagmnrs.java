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
    public String[] anagrams(String[] phrases) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < phrases.length; i++) {
            boolean isAnagram = false;
            for (int j = 0; j < result.size(); j++) {
                if (isAnagram(phrases[i], result.get(j))) {
                    isAnagram = true;
                    break;
                }
            }
            if (!isAnagram) {
                result.add(phrases[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}