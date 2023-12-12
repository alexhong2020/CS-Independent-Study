'''
The frequency with which data occurs is sometimes an important statistic. In this problem you'll determine how frequently strings occur and return a list representing the frequencies of each different/unique string. The list returned contains as many frequencies as there are unique strings. The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first frequency is how many times the alphabetically first word occurs and the last frequency is the number of times the alphabetically last word occurs.
Consider these strings (quotes for clarity, they're not part of the strings).


["apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"]

The list returned is [3,1,2,2] since the alphabetically first word is "apple" which occurs 3 times; the second word alphabetically is "banana" which occurs once, and the other words each occur twice.
'''

def freqs(data):
    # Create a dictionary to store the frequencies of each string
    freq_dict = {}

    # Count the frequencies of each string
    for word in data:
        if word in freq_dict:
            freq_dict[word] += 1
        else:
            freq_dict[word] = 1

    # Sort the dictionary by keys (lexicographically)
    sorted_freq_dict = sorted(freq_dict.items())

    # Extract the frequencies in sorted order
    frequencies = [count for word, count in sorted_freq_dict]

    return frequencies