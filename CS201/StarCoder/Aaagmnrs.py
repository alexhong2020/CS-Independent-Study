'''
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. 
For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". 
Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.
'''

def anagram(phrases):
    # Write your code here
    result = []
    for phrase in phrases:
        if phrase not in result:
            result.append(phrase)
        else:
            result.remove(phrase)
    return result