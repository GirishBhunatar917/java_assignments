package assignment;

import java.util.ArrayList;

public class InsertAtFirst_51 {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

      
        System.out.println("ArrayList before insertion:");
        System.out.println(fruits);

        
        fruits.add(0, "Apple");

        
        System.out.println("\nArrayList after inserting 'Apple' at the first position:");
        System.out.println(fruits);
    }
}
