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
        // fill in code here
        List<String> result = new ArrayList<>();
        
        for (String phrase : phrases) {
            boolean isAnagram = false;
            for (String existingPhrase : result) {
                if (areAnagrams(phrase, existingPhrase)) {
                    isAnagram = true;
                    break;
                }
            }
            if (!isAnagram) {
                result.add(phrase);
            }
        } 
        return result.toArray(new String[0]);
    }
    
    private boolean areAnagrams(String str1, String str2) {
        char[] str1_arr = str1.toLowerCase().toCharArray();
        str1 = "";
        for(char c: str1_arr){
            if(c != ' '){
                str1 += c;
            }
        }


        char[] str2_arr = str2.toLowerCase().toCharArray();
        str2 = "";
        for(char c: str2_arr){
            if(c != ' ') {
                str2 += c;
            }
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}