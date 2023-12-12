/*
The frequency with which data occurs is sometimes an important statistic. In this problem you'll determine how frequently strings occur and return an array representing the frequencies of each different/unique string. The array returned contains as many frequencies as there are unique strings. The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first frequency is how many times the alphabetically first word occurs and the last frequency is the number of times the alphabetically last word occurs.
Consider these strings (quotes for clarity, they're not part of the strings).


{"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"}

The array returned is {3,1,2,2} since the alphabetically first word is "apple" which occurs 3 times; the second word alphabetically is "banana" which occurs once, and the other words each occur twice.

data will contain at most 50 elements
each element of data will contain at most 50 characters, all characters are lowercase.
*/

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : data) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = map.get(list.get(i));
        }
        return result;
    
    }
}