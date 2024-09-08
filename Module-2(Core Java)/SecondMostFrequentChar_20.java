package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class SecondMostFrequentChar_20 {
    
    public static char findSecondMostFrequentChar(String str) {
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

      
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                    return e2.getValue().compareTo(e1.getValue()); 
                }
            }
        );

        pq.addAll(frequencyMap.entrySet());

        
        if (pq.size() < 2) {
            return '\0'; 
        }

        
        pq.poll();
        
        return pq.poll().getKey();
    }
    
    public static void main(String[] args) {
        String str = "successes";
        char result = findSecondMostFrequentChar(str);
        if (result != '\0') {
            System.out.println("The second most frequent char in the string is: " + result);
        } else {
            System.out.println("There is no second most frequent character.");
        }
    }
}
