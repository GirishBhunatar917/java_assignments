package assignment;


abstract class AbstractParent {
 
 abstract void message();
}


class FirstChild extends AbstractParent {
 @Override
 void message() {
     System.out.println("This is first child");
 }
}


class SecondChild extends AbstractParent {
 @Override
 void message() {
     System.out.println("This is second child");
 }
}

public class parent_29 {
 public static void main(String[] args) {
     
     AbstractParent first = new FirstChild();
     
     first.message();
     
   
     AbstractParent second = new SecondChild();
    
     second.message();
 }
}
