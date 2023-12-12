'''
The frequency with which data occurs is sometimes an important statistic. In this problem you'll determine how frequently strings occur and return a list representing the frequencies of each different/unique string. The list returned contains as many frequencies as there are unique strings. The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first frequency is how many times the alphabetically first word occurs and the last frequency is the number of times the alphabetically last word occurs.
Consider these strings (quotes for clarity, they're not part of the strings).


["apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"]

The list returned is [3,1,2,2] since the alphabetically first word is "apple" which occurs 3 times; the second word alphabetically is "banana" which occurs once, and the other words each occur twice.
'''

def string_frequencies(strings):
    # sort the list
    strings.sort()
    # create a list to store the frequencies
    freqs = []
    # create a variable to store the current string
    current_string = strings[0]
    # create a variable to store the current frequency
    current_freq = 1
    # iterate through the list
    for string in strings:
        # if the current string is the same as the next string
        if string == current_string:
            # increment the current frequency
            current_freq += 1
        # if the current string is not the same as the next string
        else:
            # add the current frequency to the list
            freqs.append(current_freq)
            # set the current string to the next string
            current_string = string
            # set the current frequency to 1
            current_freq = 1
    # add the last frequency to the list
    freqs.append(current_freq)
    # return the list
    return freqs
