'''
Given a phrase of one or more words, your task is to return a copy of the phrase with individual words in the same order but possibly changed in some way following these rules:
if a word in phrase is of length 3 or less it is unchanged.
if a word in phrase is of length 4 or 5, the string "ing" is added to the end of it.
if a word in phrase is of length 6 or more, the first three letters of it are swapped with the last three letters of it.

Write function change that has one string parameter named phrase. This function returns the new string with the words in the same order, but each word may have been modified by the criteria above.
phrase is of length 1 or more characters, and is only lowercase alphabetic characters or blanks. It starts and ends with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
'''

def change(phrase):
    '''
    Given the string parameter phrase, return
    a copy of the phrase with individual words
    in the same order but possibly changed in
    some way following these rules:
    if a word in phrase is of length 3 or less
    it is unchanged.
    if a word in phrase is of length 4 or 5,
    the string "ing" is added to the end of it.
    if a word in phrase is of length 6 or more,
    the first three letters of it are swapped
    with the last three letters of it.
    '''
    words = phrase.split()
    result = []
    for word in words:
        if len(word) <= 3:
            result.append(word)
        elif len(word) == 4 or len(word) == 5:
            result.append(word + "ing")
        else:
            result.append(word[3:] + word[:3])
    return " ".join(result)