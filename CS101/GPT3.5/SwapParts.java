/*
Given a phrase of one or more words, your task is to return a copy of the phrase with individual words in the same order but possibly changed in some way following these rules:
if a word in phrase is of length 3 or less it is unchanged.
if a word in phrase is of length 4 or 5, the string "ing" is added to the end of it.
if a word in phrase is of length 6 or more, the first three letters of it are swapped with the last three letters of it.
For example, consider the phrase "the redbrown fox first ran quickly through the woods"

The word "the" is unchanged
The word "redbrown" is changed to "ownbrred" with the first three letters "red" now at the end of the word and the last three letters "own" now at the beginning of the word. The middle part "br" is unchanged.
The word "fox" is unchanged
The word "first" is now "firsting"
The word "ran" is unchanged
The word "quickly" is now "kly"+"c"+"qui" or "klycqui"
The word "through" is now "ughothr"
The word "the" is unchanged
The word "woods" is now "woodsing"
The function returns "the ownbrred fox firsting ran klycqui ughothr the woodsing"
Write function change that has one string parameter named phrase. This function returns the new string with the words in the same order, but each word may have been modified by the criteria above.

*/

public class SwapParts {
    public String change(String phrase) {
        // Split the phrase into words
        String[] words = phrase.split(" ");
        
        // Create a StringBuilder to build the modified phrase
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 3) {
                // If the word is of length 3 or less, leave it unchanged
                result.append(word);
            } else if (word.length() >= 4 && word.length() <= 5) {
                // If the word is of length 4 or 5, add "ing" to the end of it
                result.append(word + "ing");
            } else {
                // If the word is of length 6 or more, swap the first three and last three letters
                int length = word.length();
                String firstThree = word.substring(0, 3);
                String middle = word.substring(3, length - 3);
                String lastThree = word.substring(length - 3);
                result.append(lastThree + middle + firstThree);
            }

            // Add a space between words
            result.append(" ");
        }

        // Remove the trailing space and return the modified phrase
        return result.toString().trim();
    }
}
