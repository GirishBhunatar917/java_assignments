package assignment;

import java.util.Scanner;

public class StringConcatenation_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        
   
        System.out.print("Enter the second string: ");
        String second= scanner.nextLine();
        
        
        String con = first.concat(second);
        
        
        System.out.println("Concatenated string: " + con);
        
     
    }
}

