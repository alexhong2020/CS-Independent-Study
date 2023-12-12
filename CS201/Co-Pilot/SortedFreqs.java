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
        ArrayList<String> unique = new ArrayList<String>();
        ArrayList<Integer> freqs = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            int index = unique.indexOf(data[i]);
            if (index == -1) {
                unique.add(data[i]);
                freqs.add(1);
            } else {
                freqs.set(index, freqs.get(index) + 1);
            }
        }
        int[] result = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            result[i] = freqs.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}