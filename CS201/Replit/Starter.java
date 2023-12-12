public int countWordsStartWithLetter(String[] words, String first) {
    int count = 0;
    for (String word : words) {
        if (word.startsWith(first)) {
            count++;
        }
    }
    return count;
}