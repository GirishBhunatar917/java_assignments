package assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList_65{
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
        
        // Define the start and end indices for the subList
        int fromIndex = 1; // inclusive
        int toIndex = 4;   // exclusive
        
        // Extract the portion of the ArrayList
        List<String> subList = list.subList(fromIndex, toIndex);
        
        // Print the extracted portion
        System.out.println("Extracted portion of ArrayList: " + subList);
    }
}
