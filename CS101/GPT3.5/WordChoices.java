/*
You are given four phrases of words and you want to figure out which words fit with the following algorithm.

The word must be in each of phrase2, phrase3 and phrase4
The word cannot be in phrase1
The unique words that meet this criteria are returned in a string, with the words in sorted alphabetical order, and with a blank as a separator between words.

Write function determine that has four string parameters named phrase1, phrase2, phrase3, and phrase4.

This function returns a string of the unique words in sorted alphabetical order that meet the criteria above, with a blank between consecutive words.

For example, suppose the parameters have the following values:

  phrase1 = "seven ten eight" 
  phrase2 = "five four seven" 
  phrase3 = "five seven four" 
  phrase4 = "four ten seven five nine" 
The words in common with phrase2, phrase3 and phrase4 are: "four", "five" and "seven". Of those words, "four" and "five" are not in phrase1. The sorted string returned is "five four"
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class WordChoices {
    public String determine(String phrase1, String phrase2, String phrase3, String phrase4) {
        // Split phrases into words and convert to sets
        Set<String> set1 = new HashSet<>(Arrays.asList(phrase1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(phrase2.split(" ")));
        Set<String> set3 = new HashSet<>(Arrays.asList(phrase3.split(" ")));
        Set<String> set4 = new HashSet<>(Arrays.asList(phrase4.split(" ")));

        // Find words that are common to phrase2, phrase3, and phrase4
        Set<String> commonWords = new HashSet<>(set2);
        commonWords.retainAll(set3);
        commonWords.retainAll(set4);

        // Remove words that are also in phrase1
        commonWords.removeAll(set1);

        // Sort the resulting words alphabetically
        Set<String> sortedWords = new TreeSet<>(commonWords);

        // Join the sorted words with spaces
        String result = sortedWords.stream().collect(Collectors.joining(" "));

        return result;
    }
}
