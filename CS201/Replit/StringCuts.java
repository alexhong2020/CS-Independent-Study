import java.util.*;

public class StringFilter {
    public String[] filter(String[] list, int minLength) {
        Set<String> uniqueStrings = new LinkedHashSet<>();
        for (String str : list) {
            if (str.length() >= minLength) {
                uniqueStrings.add(str);
            }
        }
        return uniqueStrings.toArray(new String[uniqueStrings.size()]);
    }
}