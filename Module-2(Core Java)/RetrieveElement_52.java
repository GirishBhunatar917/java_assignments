package assignment;

import java.util.ArrayList;

public class RetrieveElement_52 {
    public static void main(String[] args) {
    
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        
        int index = 2; 

        
        if (index >= 0 && index < fruits.size()) {
           
            String element = fruits.get(index);

            
            System.out.println("Element at index " + index + ": " + element);
        } else {
           
            System.out.println("Index " + index + " is out of bounds. Valid index range is from 0 to " + (fruits.size() - 1));
        }
    }
}
