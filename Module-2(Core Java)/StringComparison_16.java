package assignment;

import java.util.Scanner;

public class StringComparison_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        
       
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        
       
        boolean isEqual = first.equals(second);
        System.out.println("Comparing \"" + first+ "\" and \"" + second+ "\": " + isEqual);
        
        
        boolean isEqualIgnoreCase = first.equalsIgnoreCase(second);
        System.out.println("Comparing \"" + first + "\" and \"" + second + "\" ignoring case: " + isEqualIgnoreCase);
        
   
    }
}
