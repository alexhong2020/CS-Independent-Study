def popular(words, categories):
    word_list = words.split()
    category_list = categories.split()
    category_words = {}
    
    for word, category in zip(word_list, category_list):
        if category not in category_words:
            category_words[category] = []
        category_words[category].append(word)
    
    max_count = max(len(words) for words in category_words.values())
    max_categories = [category for category, words in category_words.items() if len(words) == max_count]
    max_categories.sort()
    
    return ' '.join(sorted(category_words[max_categories[0]]))