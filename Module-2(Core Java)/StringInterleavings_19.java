package assignment;

import java.util.HashSet;
import java.util.Set;

public class StringInterleavings_19{

    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";
        Set<String> result = new HashSet<>();
        
        
        findInterleavings(s1, s2, "", result);
        
     
        System.out.println("The interleaving strings are: " + result);
    }

   
    private static void findInterleavings(String s1, String s2, String interleaved, Set<String> result) {
        
        if (s1.isEmpty() && s2.isEmpty()) {
            result.add(interleaved);
            return;
        }

        
        if (!s1.isEmpty()) {
            findInterleavings(s1.substring(1), s2, interleaved + s1.charAt(0), result);
        }

        
        if (!s2.isEmpty()) {
            findInterleavings(s1, s2.substring(1), interleaved + s2.charAt(0), result);
        }
    }
}

