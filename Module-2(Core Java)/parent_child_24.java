package assignment;


class Parent {
 
 public void printMessage() {
     System.out.println("This is a parent class");
 }
}


class Child extends Parent {

 public void printMessage() {
     System.out.println("This is a child class");
 }
}

public class parent_child_24 {
 public static void main(String[] args) {
     
     Parent parentObj = new Parent();
     parentObj.printMessage();  
     
     
     Child childObj = new Child();
     childObj.printMessage();   
     
  
     childObj.printMessage();  
 }
}
