/*
Problem Statement:
Determine how many unique words in an array of words start with a specified letter. 
Write a method that determines how many different strings in words have a first letter equal to first.

Constraints:
There will be at most 50 elements in words.
first will be a single character string.
*/

import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        // Your code here
        Set<String> set = new HashSet<>();
        for(String word: words) {
            if(word.startsWith(first)) {
                set.add(word);
            }
        }
        return set.size();
    }
}