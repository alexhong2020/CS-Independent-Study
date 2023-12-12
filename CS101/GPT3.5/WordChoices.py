'''
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

phrase1, phrase2, phrase3 and phrase4 are all of length 1 or more lowercase alphabetic characters or blanks. They each start and end with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
There could be duplicate words in any of phrase1, phrase2, phrase3 or phrase4. Only unique words are in the return string.
'''

def determine(phrase1, phrase2, phrase3, phrase4):
    # Split the phrases into lists of words
    words1 = set(phrase1.split())
    words2 = set(phrase2.split())
    words3 = set(phrase3.split())
    words4 = set(phrase4.split())

    # Find words in common between phrase2, phrase3, and phrase4
    common_words = words2.intersection(words3, words4)

    # Remove words from common_words that are in phrase1
    common_words.difference_update(words1)

    # Sort the unique words and join them with a blank separator
    result = ' '.join(sorted(common_words))

    return result
