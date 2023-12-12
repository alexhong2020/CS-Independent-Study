'''
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. 
For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". 
Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.
'''

def anagrams(phrases):
    # Write your code here
    new_list = []
    for i in range(len(phrases)):
        for j in range(i+1, len(phrases)):
            if is_anagram(phrases[i], phrases[j]):
                phrases[j] = ''
    for i in range(len(phrases)):
        if phrases[i] != '':
            new_list.append(phrases[i])
    return new_list

def is_anagram(phrase1, phrase2):
    phrase1 = phrase1.lower()
    phrase2 = phrase2.lower()
    phrase1 = phrase1.replace(' ', '')
    phrase2 = phrase2.replace(' ', '')
    if len(phrase1) != len(phrase2):
        return False
    else:
        for i in range(len(phrase1)):
            if phrase1[i] != phrase2[i]:
                return False
        return True