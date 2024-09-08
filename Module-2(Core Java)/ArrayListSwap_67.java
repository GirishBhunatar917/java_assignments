package assignment;

import java.util.ArrayList;

public class ArrayListSwap_67{
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

        // Indices of the elements to swap
        int index1 = 1; // Index of "Banana"
        int index2 = 3; // Index of "Date"

        // Swap the elements at index1 and index2
        swap(list, index1, index2);

        // Print the ArrayList after swapping
        System.out.println("ArrayList after swapping elements at indices " + index1 + " and " + index2 + ": " + list);
    }

    // Method to swap elements in an ArrayList
    public static <T> void swap(ArrayList<T> list, int index1, int index2) {
        // Check if indices are within bounds
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Swap elements
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
