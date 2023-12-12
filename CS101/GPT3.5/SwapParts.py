'''
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

phrase is of length 1 or more characters, and is only lowercase alphabetic characters or blanks. It starts and ends with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
'''

def change(phrase):
    # Split the phrase into words
    words = phrase.split()

    # Initialize an empty list to store the modified words
    modified_words = []

    # Iterate through the words in the phrase
    for word in words:
        if len(word) <= 3:
            # If the word has 3 or fewer characters, keep it unchanged
            modified_words.append(word)
        elif 4 <= len(word) <= 5:
            # If the word has 4 or 5 characters, add "ing" to the end of it
            modified_words.append(word + "ing")
        else:
            # If the word has 6 or more characters, swap the first three and last three letters
            modified_words.append(word[-3:] + word[3:-3] + word[:3])

    # Join the modified words back into a single string
    result = ' '.join(modified_words)

    return result
