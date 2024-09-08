package assignment;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection_75 {
    public static void main(String[] args) {
     
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

      
        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Elderberry");
        set2.add("Fig");

        
        System.out.println("Original Set1: " + set1);
        System.out.println("Original Set2: " + set2);

       
        set1.retainAll(set2);

    
        System.out.println("Common elements in both sets: " + set1);
    }
}
