package assignment;

import java.util.ArrayList;

public class ArrayListPrintByPosition_74 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
      
        System.out.println("Elements of the ArrayList with their positions:");
        for (int i = 0; i < list.size(); i++) {
           
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}
