package assignment;


abstract class Bank {
 
 abstract int getBalance();
}


class BankA extends Bank {
 @Override
 int getBalance() {
     return 100;
 }
}


class BankB extends Bank {
 @Override
 int getBalance() {
     return 150;
 }
}


class BankC extends Bank {
 @Override
 int getBalance() {
     return 200;
 }
}


public class bank_30{
 public static void main(String[] args) {
    
     Bank bankA = new BankA();
     Bank bankB = new BankB();
     Bank bankC = new BankC();
     
    
     System.out.println("BankA Balance: " + bankA.getBalance());
     System.out.println("BankB Balance: " + bankB.getBalance());
     System.out.println("BankC Balance: " + bankC.getBalance());
 }
}
