'''
Determine how many unique words in an array of words start with a specified letter. Write a method that determines how many different strings in words have a first letter equal to first.
'''

def begins(words, first):
    count = 0
    for i in range(len(words)):
        if words[i][0] == first:
            count += 1
    return count