package assignment;

import java.util.Scanner;

public class try_catch_36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine()); 
            
            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine()); 
            
         
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        
        } finally {
           
            System.out.println("Operation completed.");
            scanner.close(); 
        }
    }
}
