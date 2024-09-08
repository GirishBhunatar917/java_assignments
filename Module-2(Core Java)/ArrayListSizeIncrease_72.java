package assignment;

import java.util.ArrayList;

public class ArrayListSizeIncrease_72 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
       
        System.out.println("Initial size of ArrayList: " + list.size());
        
    
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
   
        System.out.println("ArrayList after adding elements: " + list);
        System.out.println("Size of ArrayList after adding elements: " + list.size());
        
      
        list.add("Elderberry");
        list.add("Fig");
        
        
        System.out.println("ArrayList after adding more elements: " + list);
        System.out.println("Size of ArrayList after adding more elements: " + list.size());
    }
}
