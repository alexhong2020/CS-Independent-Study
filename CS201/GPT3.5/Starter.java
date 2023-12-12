/*
Problem Statement:
Determine how many unique words in an array of words start with a specified letter. 
Write a method that determines how many different strings in words have a first letter equal to first.

Constraints:
There will be at most 50 elements in words.
first will be a single character string.
*/

public class Starter {
    public int begins(String[] words, String first) {
        int count = 0; // Initialize a count to keep track of matching words

        // Iterate through the array of words
        for (String word : words) {
            // Check if the first character of the word matches the specified character
            if (word.startsWith(first)) {
                count++;
            }
        }

        return count;
    }
}
