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
import java.util.*;

public class WordChoices {
    public String determine(String phrase1, String phrase2, String phrase3, String phrase4){
        String[] words = phrase1.split(" ");
        String[] words2 = phrase2.split(" ");
        String[] words3 = phrase3.split(" ");
        String[] words4 = phrase4.split(" ");
        String[] words5 = new String[words.length + words2.length + words3.length + words4.length];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            words5[index] = words[i];
            index++;
        }
        for (int i = 0; i < words2.length; i++) {
            words5[index] = words2[i];
            index++;
        }
        for (int i = 0; i < words3.length; i++) {
            words5[index] = words3[i];
            index++;
        }
        for (int i = 0; i < words4.length; i++) {
            words5[index] = words4[i];
            index++;
        }
        Arrays.sort(words5);
        String result = "";
        for (int i = 0; i < words5.length; i++) {
            if (i == 0) {
                result = words5[i];
            } else {
                result = result + " " + words5[i];
            }
        }
        return result;
    }
}