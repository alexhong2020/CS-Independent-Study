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
    '''
    There is one string parameter phrase,
    where phrase is a phrase of one or
    more words.
    This function returns a new phrase where
    each word from the original phrase is in
    the same order but may have been changed
    in some way. See the specifications. 
    '''
      
    # you write code here