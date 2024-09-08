package assignment;

import java.util.Scanner;

public class fact_32 {

   
    public static long Factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        
      
        try {
            long factorial = Factorial(number);
            System.out.println(number + "! = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
