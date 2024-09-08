package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapValuesView_76 {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");
        map.put("Key4", "Value4");

     
        System.out.println("Original Map: " + map);

       
        Collection<String> values = map.values();

        
        System.out.println("Collection view of values: " + values);
    }
}
