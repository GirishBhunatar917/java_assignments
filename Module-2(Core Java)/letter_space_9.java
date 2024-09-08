package assignment;

import java.util.Scanner;

public class letter_space_9 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
      
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        
       
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        
     
        System.out.println("Letters: " + letterCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Other characters: " + otherCount);
        
    
    }
}
