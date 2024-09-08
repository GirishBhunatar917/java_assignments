package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle_58 {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        // Print the original list
        System.out.println("Original List: " + list);
        
        // Shuffle the ArrayList
        Collections.shuffle(list);
        
        // Print the shuffled list
        System.out.println("Shuffled List: " + list);
    }
}
