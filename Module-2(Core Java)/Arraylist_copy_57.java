package assignment;

import java.util.ArrayList;

public class Arraylist_copy_57{
    public static void main(String[] args) {
     
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        
        
        System.out.println("Original List: " + originalList);
        
    
        ArrayList<String> copiedList = new ArrayList<>();
        
        
        copiedList.addAll(originalList);
        
    
        System.out.println("Copied List using addAll(): " + copiedList);
        
        
        ArrayList<String> anotherCopiedList = new ArrayList<>(originalList);
        
   
        System.out.println("Another Copied List using constructor: " + anotherCopiedList);
    }
}
