package assignment;

import java.util.HashSet;

public class HashSetIteration_60 {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

       
        System.out.println("Iterating using enhanced for loop:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
