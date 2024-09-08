package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList_70 {
    public static void main(String[] args) {
        // Create and populate the HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the original HashSet
        System.out.println("Original HashSet: " + set);

        // Convert the HashSet to an ArrayList
        List<String> list = new ArrayList<>(set);

        // Print the ArrayList
        System.out.println("Converted ArrayList: " + list);
    }
}
