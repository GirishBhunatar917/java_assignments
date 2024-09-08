package assignment;

import java.util.ArrayList;

public class ArrayListJoin_68 {
    public static void main(String[] args) {
        // Create and populate the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        
        // Create and populate the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");
        
        // Print the original ArrayLists
        System.out.println("Original List1: " + list1);
        System.out.println("Original List2: " + list2);
        
        // Join list2 to list1
        list1.addAll(list2);
        
        // Print the joined ArrayList
        System.out.println("Joined ArrayList: " + list1);
    }
}
