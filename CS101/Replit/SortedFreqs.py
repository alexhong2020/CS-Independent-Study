def freqs(data):
    counts = {}
    for word in sorted(data):
        counts[word] = counts.get(word, 0) + 1
    return [counts[word] for word in sorted(counts)]
