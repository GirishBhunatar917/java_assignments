package assignment;

import java.util.ArrayList;

public class RemoveThirdElement_54 {
    public static void main(String[] args) {
       
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

     
        System.out.println("ArrayList before removal:");
        System.out.println(fruits);

        
        int indexToRemove = 2;

      
        if (indexToRemove >= 0 && indexToRemove < fruits.size()) {
          
            String removedElement = fruits.remove(indexToRemove);

        
            System.out.println("Removed element: " + removedElement);

            
            System.out.println("\nArrayList after removal:");
            System.out.println(fruits);
        } else {
         
            System.out.println("Index " + indexToRemove + " is out of bounds. Valid index range is from 0 to " + (fruits.size() - 1));
        }
    }
}
