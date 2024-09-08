package assignment;

import java.util.HashMap;
import java.util.Map;

public class MapSizeExample_63{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();
        
        // Add some key-value pairs
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Date");
        
        // Get the number of key-value mappings
        int numberOfMappings = map.size();
        
        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the map: " + numberOfMappings);
    }
}
