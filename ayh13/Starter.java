import java.util.*;
//import java.util.Set;
//import java.util.HashSet;

public class Starter {

    public int begins(String[] words, String first) {
        
        int ctr = 0;

        HashSet<String> hs = new HashSet<>(Arrays.asList(words));

        for(String s: hs){
            if(s.startsWith(first)){
                ctr++;
            }
        }

        return ctr;
    }

}