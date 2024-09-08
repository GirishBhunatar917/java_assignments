package assignment;

import java.util.Scanner;

public class cant_divide_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Enter two numbers (numerator and denominator): ");
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            
           
            int result = numerator / denominator; 
            System.out.println("Result of division: " + result);
        
        } catch (ArithmeticException e) {
           
            System.out.println("Error: Cannot divide by zero.");
        
        } finally {
         
            System.out.println("Operation completed.");
            scanner.close(); 
        }
    }
}
