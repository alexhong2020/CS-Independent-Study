'''
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.
'''

def anagrams(phrases):
    anagrams = []
    for i in range(len(phrases)):
        phrase = phrases[i]
        phrase = phrase.replace(" ", "")
        phrase = phrase.lower()
        phrase = sorted(phrase)
        phrases[i] = "".join(phrase)
    for i in range(len(phrases)):
        if phrases[i] not in anagrams:
            anagrams.append(phrases[i])
    return anagrams