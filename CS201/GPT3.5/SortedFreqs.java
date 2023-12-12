/*
The frequency with which data occurs is sometimes an important statistic. In this problem you'll determine how frequently strings occur and return an array representing the frequencies of each different/unique string. The array returned contains as many frequencies as there are unique strings. The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first frequency is how many times the alphabetically first word occurs and the last frequency is the number of times the alphabetically last word occurs.
Consider these strings (quotes for clarity, they're not part of the strings).


{"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"}

The array returned is {3,1,2,2} since the alphabetically first word is "apple" which occurs 3 times; the second word alphabetically is "banana" which occurs once, and the other words each occur twice.

data will contain at most 50 elements
each element of data will contain at most 50 characters, all characters are lowercase.
*/

import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        // Create a HashMap to count the frequency of each unique string
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : data) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Extract unique strings and sort them lexicographically
        List<String> uniqueStrings = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(uniqueStrings);

        // Create the result array with frequencies
        int[] result = new int[uniqueStrings.size()];
        for (int i = 0; i < uniqueStrings.size(); i++) {
            result[i] = frequencyMap.get(uniqueStrings.get(i));
        }

        return result;
    }
}
