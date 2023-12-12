def begins(words, first):
    count = 0
    for word in words:
        if word.startswith(first):
            count += 1
    return count