def change(phrase):
    words = phrase.split()
    modified_words = []
    
    for word in words:
        if len(word) <= 3:
            modified_words.append(word)
        elif len(word) <= 5:
            modified_words.append(word + "ing")
        else:
            modified_words.append(word[-3:] + word[3:-3] + word[:3])
    
    return ' '.join(modified_words)