'''
Determine how many unique words in an array of words start with a specified letter. Write a method that determines how many different strings in words have a first letter equal to first.
'''

def count_words_with_letter(words, letter):
    count = 0
    for word in words:
        if word[0] == letter:
            count += 1
    return count