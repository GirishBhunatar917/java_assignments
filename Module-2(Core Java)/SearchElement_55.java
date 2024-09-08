package assignment;

import java.util.ArrayList;

public class SearchElement_55 {
    public static void main(String[] args) {
       
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

       
        String searchElement = "Cherry";
        
        
        boolean containsElement = fruits.contains(searchElement);
        if (containsElement) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }

        
        int index = fruits.indexOf(searchElement);
        if (index != -1) {
            System.out.println(searchElement + " is found at index: " + index);
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }

        
        String notFoundElement = "Fig";
        if (fruits.contains(notFoundElement)) {
            System.out.println(notFoundElement + " is present in the ArrayList.");
        } else {
            System.out.println(notFoundElement + " is not present in the ArrayList.");
        }
    }
}
