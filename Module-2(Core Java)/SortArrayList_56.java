package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList_56 {
    public static void main(String[] args) {
       
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Elderberry");
        fruits.add("Date");

      
        System.out.println("ArrayList before sorting:");
        System.out.println(fruits);

       
        Collections.sort(fruits);

       
        System.out.println("\nArrayList after sorting:");
        System.out.println(fruits);
    }
}
