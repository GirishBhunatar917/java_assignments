package assignment;

import java.util.ArrayList;

public class UpdateElement_53 {
    public static void main(String[] args) {
      
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        
        System.out.println("ArrayList before update:");
        System.out.println(fruits);

       
        int indexToUpdate = 2; 
        String newElement = "Orange";

       
        if (indexToUpdate >= 0 && indexToUpdate < fruits.size()) {
           
            String oldElement = fruits.set(indexToUpdate, newElement);

            
            System.out.println("Updated index " + indexToUpdate + " from '" + oldElement + "' to '" + newElement + "'.");

          
            System.out.println("\nArrayList after update:");
            System.out.println(fruits);
        } else {
            
            System.out.println("Index " + indexToUpdate + " is out of bounds. Valid index range is from 0 to " + (fruits.size() - 1));
        }
    }
}
