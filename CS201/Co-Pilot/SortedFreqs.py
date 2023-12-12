'''
The frequency with which data occurs is sometimes an important statistic. In this problem you'll determine how frequently strings occur and return a list representing the frequencies of each different/unique string. The list returned contains as many frequencies as there are unique strings. The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first frequency is how many times the alphabetically first word occurs and the last frequency is the number of times the alphabetically last word occurs.
Consider these strings (quotes for clarity, they're not part of the strings).


["apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"]

The list returned is [3,1,2,2] since the alphabetically first word is "apple" which occurs 3 times; the second word alphabetically is "banana" which occurs once, and the other words each occur twice.
'''

def freqs(data):
    freqs = []
    data = sorted(data)
    for i in range(len(data)):
        if data[i] not in freqs:
            freqs.append(data.count(data[i]))
    return freqs