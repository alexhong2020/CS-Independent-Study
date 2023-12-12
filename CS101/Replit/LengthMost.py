def count(phrase):
    words = phrase.split()
    word_lengths = {}
    
    for word in words:
        length = len(word)
        if length not in word_lengths:
            word_lengths[length] = 0
        word_lengths[length] += 1
    
    max_count = max(word_lengths.values())
    max_lengths = [length for length, count in word_lengths.items() if count == max_count]
    max_lengths.sort()
    
    return f"{max_count}:{'-'.join(map(str, max_lengths))}"