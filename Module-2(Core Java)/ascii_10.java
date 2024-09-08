package assignment;

import java.util.Scanner;

public class ascii_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        
        
        if (input.length() == 1) {
            char character = input.charAt(0);
            int asciiValue = (int) character;
            System.out.println("The ASCII value of '" + character + "' is " + asciiValue);
        } else {
            System.out.println("Error: Please enter exactly one character.");
        }
        
      
    }
}
