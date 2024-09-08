package assignment;

public class StringStartsWithCheck_18 {
    public static void main(String[] args) {
        
        String str1 = "Red is favorite color.";
        String prefix1 = "Red";
        
        
        boolean result1 = str1.startsWith(prefix1);
        System.out.println("\"" + str1 + "\" starts with \"" + prefix1 + "\"? " + result1);

        
        String str2 = "Orange is also my favorite color.";
        String prefix2 = "Red";
        
     
        boolean result2 = str2.startsWith(prefix2);
        System.out.println("\"" + str2 + "\" starts with \"" + prefix2 + "\"? " + result2);
    }
}
