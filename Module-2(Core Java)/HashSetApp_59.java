package assignment;

import java.util.HashSet;

public class HashSetApp_59 {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Print the original HashSet
        System.out.println("Original HashSet: " + set);

        // Append a specified element to the HashSet
        String newElement = "Date";
        set.add(newElement);

        // Print the HashSet after adding the new element
        System.out.println("HashSet after appending " + newElement + ": " + set);
    }
}
