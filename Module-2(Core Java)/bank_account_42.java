package assignment;

import java.util.Scanner;

public class bank_account_42 {
    private double balance;

    // Constructor
    public bank_account_42(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientBalanceException(deficit);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
    	 bank_account_42 account = new bank_account_42(2000);

        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Attempt to withdraw the amount
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());

        } finally {
            // This block will always execute
            System.out.println("Transaction completed.");
            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }
}
//InsufficientBalanceException.java
 class InsufficientBalanceException extends Exception {
 private double deficit;

 // Constructor
 public InsufficientBalanceException(double deficit) {
     super("Sorry, insufficient balance, you need more " + deficit + " Rs. to perform this transaction.");
     this.deficit = deficit;
 }

 // Getter for deficit
 public double getDeficit() {
     return deficit;
 }
}
