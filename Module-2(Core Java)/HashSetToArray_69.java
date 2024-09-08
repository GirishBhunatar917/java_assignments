package assignment;

import java.util.HashSet;

public class HashSetToArray_69 {
    public static void main(String[] args) {
        // Create and populate the HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the original HashSet
        System.out.println("Original HashSet: " + set);

        // Convert the HashSet to an array of Strings
        String[] array = new String[set.size()];
        array = set.toArray(array);

        // Print the array
        System.out.println("Converted Array: ");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
