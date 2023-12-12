/*
Filtering data often requires determining which data elements satisfy a specific criterion. 
Write method filter which has two parameters: a String[] of data to be filtered and an int parameter indicating the minimum acceptable length for the string data.

Return a String[] array of the unique strings in list whose lengths are greater than or equal to minLength.

The string values in the returned array should be in the same order they appear in list. The strings in the returned array should be unique, so conceptually only the first of any duplicate elements in list that pass the length requirement is in the returned array. See the examples for details.

The array list will contain at most 50 elements.
*/

import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength && !result.contains(list[i])) {
                result.add(list[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}