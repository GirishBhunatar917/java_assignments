package assignment;

import java.util.Scanner;

public class digit_count_8 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an integer number less than ten billion: ");
        
       
        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            
           
            if (number >= 0 && number < 10000000000L) {
                int digitCount = countDigits(number);
                System.out.println("Number of digits in the number: " + digitCount);
            } else {
                System.out.println("The number must be positive and less than ten billion.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }
        
     
    }
    
   
    public static int countDigits(long number) {
        if (number == 0) {
            return 1; 
        }
        int count = 0;
        while (number > 0)
        {
            number /= 10; 
            count++;
        }
        return count;
    }
}
