package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRev_64 {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);
        
        // Reverse the ArrayList
        Collections.reverse(list);
        
        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);
    }
}
