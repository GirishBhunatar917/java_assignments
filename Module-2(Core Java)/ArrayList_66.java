package assignment;

import java.util.ArrayList;

public class ArrayList_66 {
    public static void main(String[] args) {
        // Create and populate the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        
        // Create and populate the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        
        // Create a third ArrayList with different elements
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Date");
        list3.add("Elderberry");
        
        // Compare list1 and list2
        boolean areEqual1 = list1.equals(list2);
        System.out.println("List1 and List2 are equal: " + areEqual1);
        
        // Compare list1 and list3
        boolean areEqual2 = list1.equals(list3);
        System.out.println("List1 and List3 are equal: " + areEqual2);
    }
}
