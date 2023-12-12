import java.util.*;
//import java.util.Set;
//import java.util.HashSet;

public class Starter {

    public int begins(String[] words, String first) {
        int count = 0;
        Set<String> seen = new HashSet<>();
        for (String word : words) {
            if (String.valueOf(word.charAt(0)) == first && !seen.contains(word)) {
                count++;
                seen.add(word);
            }
        }
        return count;
    }

}