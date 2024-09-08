package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterater_50 {
    public static void main(String[] args) {
       
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        
        System.out.println("Method 1: Enhanced for loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        
        System.out.println("\nMethod 2: Using Iterator");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

      
        System.out.println("\nMethod 3: Using ListIterator");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

      
        System.out.println("\nMethod 4: Using forEach with lambda expression");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
