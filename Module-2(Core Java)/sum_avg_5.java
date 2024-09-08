package assignment;

import java.util.Scanner;

public class sum_avg_5 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
         int COUNT = 5;
        double sum = 0, num,average;
        
   
        System.out.println("Enter numbers:");
        
        for (int i = 1; i <= COUNT; i++) {
        	
            System.out.print("Number " + i + ": ");
            num = scanner.nextDouble();
                sum=sum+num;
           
        }
        
      
        average = sum / COUNT;
        
       
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
     
    }
}
