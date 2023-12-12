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
        // Write your code here.
        Map<String, Integer> map = new HashMap<>();
        for (String s : data) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        int[] res = new int[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            res[i] = map.get(keys.get(i));
        }
        return res;
    }
}