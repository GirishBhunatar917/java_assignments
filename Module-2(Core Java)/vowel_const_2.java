package assignment;

import java.util.Scanner;

public class vowel_const_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a single character: ");
        String ch = scanner.nextLine();
       
        
        if (ch.length() != 1) {
            System.out.println(" Please enter exactly one character.");
            return;
        }
        
        char cha = ch.charAt(0);
        
        if (!Character.isLetter(cha)) {
            System.out.println(" Please enter a valid alphabetic character.");
            return;
        }
        
  
        if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'
        	||cha == 'A' || cha == 'E' || cha == 'I' || cha == 'O' || cha == 'U') {
            System.out.println("character is Vowel");
        } else {
            System.out.println("character is Consonant");
        }
	}

}

