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

public class WordChoices {
    public String determine(String phrase1, String phrase2, String phrase3, String phrase4)
    {
        String[] words1 = phrase1.split(" ");
        String[] words2 = phrase2.split(" ");
        String[] words3 = phrase3.split(" ");
        String[] words4 = phrase4.split(" ");
        String[] words = new String[words2.length + words3.length + words4.length];
        int count = 0;
        for (int i = 0; i < words2.length; i++)
        {
            for (int j = 0; j < words3.length; j++)
            {
                for (int k = 0; k < words4.length; k++)
                {
                    if (words2[i].equals(words3[j]) && words2[i].equals(words4[k]))
                    {
                        words[count] = words2[i];
                        count++;
                    }
                }
            }
        }
        String[] words5 = new String[count];
        for (int i = 0; i < count; i++)
        {
            words5[i] = words[i];
        }
        String[] words6 = new String[count];
        int count2 = 0;
        for (int i = 0; i < words5.length; i++)
        {
            boolean found = false;
            for (int j = 0; j < words1.length; j++)
            {
                if (words5[i].equals(words1[j]))
                {
                    found = true;
                }
            }
            if (!found)
            {
                words6[count2] = words5[i];
                count2++;
            }
        }
        String[] words7 = new String[count2];
        for (int i = 0; i < count2; i++)
        {
            words7[i] = words6[i];
        }
        for (int i = 0; i < words7.length; i++)
        {
            for (int j = i + 1; j < words7.length; j++)
            {
                if (words7[i].compareTo(words7[j]) > 0)
                {
                    String temp = words7[i];
                    words7[i] = words7[j];
                    words7[j] = temp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < words7.length; i++)
        {
            result += words7[i];
            if (i < words7.length - 1)
            {
                result += " ";
            }
        }
        return result;
    }
}