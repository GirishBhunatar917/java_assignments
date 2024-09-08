package assignment;

import java.util.ArrayList;

public class ArrayListReplace_73 {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");  
        list.add("Banana");   
        list.add("Cherry");   
        list.add("Date");     
        
        
        System.out.println("Original ArrayList: " + list);
        
      
        String newElement = "Blueberry";
        
     
        if (list.size() > 1) {
            list.set(1, newElement);
        } else {
            System.out.println("The list does not have a second element.");
        }
        
    
        System.out.println("ArrayList after replacing the second element: " + list);
    }
}
