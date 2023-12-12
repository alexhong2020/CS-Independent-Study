'''
You are given four phrases of words and you want to figure out which words fit with the following algorithm.

The word must be in each of phrase2, phrase3 and phrase4
The word cannot be in phrase1
The unique words that meet this criteria are returned in a string, with the words in sorted alphabetical order, and with a blank as a separator between words.

Write function determine that has four string parameters named phrase1, phrase2, phrase3, and phrase4.

This function returns a string of the unique words in sorted alphabetical order that meet the criteria above, with a blank between consecutive words.

'''

def determine(phrase1, phrase2, phrase3, phrase4):
    # Write your code here
    words1 = phrase1.split()
    words2 = phrase2.split()
    words3 = phrase3.split()
    words4 = phrase4.split()
    words = []
    for word in words2:
        if word in words3 and word in words4 and word not in words1:
            words.append(word)
    return ' '.join(sorted(words))