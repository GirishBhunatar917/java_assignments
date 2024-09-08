package assignment;

import java.util.Scanner;

public class accept_integer_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number: ");
        
      
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
          
            int nn = Integer.parseInt("" + n + n); // 
            int nnn = Integer.parseInt("" + n + n + n); 
            
            
            int result = n + nn + nnn;
            
           
            System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
