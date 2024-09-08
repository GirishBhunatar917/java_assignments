package assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample_62{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();
        
        // Associate values with keys
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Date");

        // Print the HashMap
        System.out.println("HashMap contents:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
