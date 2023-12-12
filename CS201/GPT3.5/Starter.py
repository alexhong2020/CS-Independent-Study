'''
Determine how many unique words in an array of words start with a specified letter. Write a method that determines how many different strings in words have a first letter equal to first.
'''

def begins(words, first):
    # Create a set to store unique words that start with the specified letter
    unique_words = set()

    for word in words:
        # Check if the word starts with the specified letter
        if word.startswith(first):
            unique_words.add(word)

    # Return the count of unique words
    return len(unique_words)