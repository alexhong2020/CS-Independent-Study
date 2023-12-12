'''
This problem is given two string parameters called words, and categories where the kth word in words corresponds to the kth category in categories, meaning the word is in that category. This function calculates the most popular category, returning a string of sorted words in that category. If there is a tie, then of the categories that are tied, return the words from the category first in alphabetical order.
It is possible that there are not the same number of words in the string words or categories. If that is the case, only use the words that have a corresponding word in the other string.

Here is an example with one category with the most words, and also the number of words in the two strings is not equal.

words =  "ten purple eight owl red blue five fish yellow cat dog six nine bird blue"
categories = "number color number animal color color number animal color animal animal number number" 
Here words has 15 words and categories has 13 words. We ignore the last two words in words. With the remaining words we see there are 3 categories: number has five words, animal has four words and color has four words. Since the number category has the most words we return those words in sorted order, returning: "eight five nine six ten"

Here is an example with categories in a tie.

words = "red blue five fish yellow cat dog six nine bird blue"
categories = "color color number animal color animal animal number number" 
  
You can see that red is in the color category, blue is in the color category, five is in the number category and fish is in the animal category. Note fish is in index position 3 in words and animal is its category since animal is in index position 3 in categories.

Here we see there are three words in the color category, three words in the number category and three words in the animal category. The most number in any category is three and all three categories have three items in their category so it is a three-way tie. Since animal comes first in alphabetical order, before number and color, the return value is all the words in the animal category, in sorted order, or "cat dog fish".

Write function popular that has two string parameters named words and categories, where the kth word in words corresponds to the kth word in categories. This function returns a string of the sorted words from the largest category. If there is a tie, then from the categories that tied, choose the category that comes first in alphabetical order.

words is of length 1 or more characters, and is only lowercase alphabetic characters or blanks. It starts and ends with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
categories is of length 1 or more characters, and is only lowercase alphabetic characters or blanks. It starts and ends with an alphabetic character, and if there are blanks, there cannot be two adjacent blanks.
There can be duplicate words in words or categories. Duplicate words should be counted.
It is possible that a word could be categorized in more than one category.
'''

def popular(words, categories):
    # Your code here
    words = words.split()
    categories = categories.split()
    words_dict = {}
    for i in range(len(words)):
        if words[i] not in words_dict:
            words_dict[words[i]] = [categories[i]]
        else:
            words_dict[words[i]].append(categories[i])
    max_category = ""
    max_count = 0
    for key, value in words_dict.items():
        if len(value) > max_count:
            max_category = key
            max_count = len(value)
    return max_category

    