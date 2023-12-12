'''
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.
'''

def are_anagrams(phrase1, phrase2):
    # Normalize both phrases: remove spaces and convert to lowercase
    normalized1 = "".join(phrase1.split()).lower()
    normalized2 = "".join(phrase2.split()).lower()
    
    # Check if the normalized phrases are equal when sorted
    return sorted(normalized1) == sorted(normalized2)

def anagrams(phrases):
    result = []
    seen = set()
    
    for phrase in phrases:
        is_anagram = False
        for prev_phrase in result:
            if are_anagrams(phrase, prev_phrase):
                is_anagram = True
                break
        if not is_anagram:
            result.append(phrase)
    
    return result
