'''
Determine how many unique words in an array of words start with a specified letter. Write a method that determines how many different strings in words have a first letter equal to first.
'''

def begins(words, first):
    return len(set(word for word in words if word[0] == first))