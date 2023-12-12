/*
Given a phrase, your task is to calculate which word length occurs the most times. Return a string that has three components.
the number of words for the most times for a length a colon the length of words that occur the most. If there is a tie with more than one length that occurs the most, the tied lengths are in numeric sorted order separated by dashes.

Here is an example with one most value. Consider the phrase "this is how we count length in a line"

There are:
1 word of length 1: a
3 words of length 2: is we in
1 word of length 3: how
2 words of length 4: this line
1 word of length 5: count
1 word of length 6: length
The length with the most words is length 2, there are 3 words of length 2. Return the string "3:2"
Here is an example with a tie for the length with the most words. Consider the phrase "one two three four five six seven eight nine ten eleven twelve thirteen twenty thirty forty"

There are
4 words of length 3: one two six ten
3 words of length 4: four five nine
4 words of length 5: three seven eight forty
4 words of length 6: eleven twelve twenty thirty
1 word of length 8: thirteen
The word length that occurs the most is a tie with length 3, length 5 and length 6. They each have 4 words, which is the most.
The return value would be the most number of words, 4, followed by ":", and followed by the sorted lengths that have that many words, 3, 5 and 6, with a colon as separator. The return value is the string "4:3-5-6".

Write function count that has one string parameter named phrase. This function returns a string in the format described above that indicates the length that has the most words (or all the ones that tied, in sorted numeric order and separated by dashes) and how many words was the most. Use the format above.
phrase is of length 1 or more characters, and is only lowercase alphabetic characters or blanks. It starts and ends with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
There can be duplicate words in the phrase. Duplicate words should be counted.
*/

public class LengthMost{
    public String count(String phrase) {
        int[] lengths = new int[26];
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ')
                lengths[phrase.charAt(i) - 'a']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (lengths[i] > max)
                max = lengths[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (lengths[i] == max) {
                if (sb.length() > 0)
                    sb.append("-");
                sb.append(i + 1);
            }
        }
        return max + ":" + sb.toString();
    }
}