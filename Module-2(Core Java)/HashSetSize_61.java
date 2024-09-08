package assignment;

import java.util.HashSet;

public class HashSetSize_61 {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        
        
        int numberOfElements = set.size();
        
        
        System.out.println("Number of elements in the HashSet: " + numberOfElements);
    }
}
