def determine(phrase1, phrase2, phrase3, phrase4):
    words1 = set(phrase1.split())
    words2 = set(phrase2.split())
    words3 = set(phrase3.split())
    words4 = set(phrase4.split())
    
    common_words = words2.intersection(words3, words4)
    unique_words = common_words.difference(words1)
    
    return ' '.join(sorted(unique_words))