package assignment;

import java.util.Scanner;

public class AgeValidator_41 {

    // Method to validate age
    public static void validate(int age) {
        if (age < 18) {
            // Throw an ArithmeticException if age is less than 18
            throw new ArithmeticException("Not valid");
        } else {
            // Print welcome message if age is 18 or older
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Call validate method
            validate(age);

        } catch (ArithmeticException e) {
            // Handle the ArithmeticException thrown by validate method
            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());

        } finally {
            // This block will always execute
            System.out.println("Operation completed.");
            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }
}
