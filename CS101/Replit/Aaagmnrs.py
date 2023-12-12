def anagrams(phrases):
    result = []
    seen_anagrams = set()
    for phrase in phrases:
        phrase_sorted = ''.join(sorted(phrase.lower().replace(' ', '')))
        if phrase_sorted not in seen_anagrams:
            result.append(phrase)
            seen_anagrams.add(phrase_sorted)
    return result