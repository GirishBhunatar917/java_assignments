package assignment;


abstract class Marks {
 
 abstract double getPercentage();
}


class A extends Marks {
 private int marks1, marks2, marks3;

 
 public A(int marks1, int marks2, int marks3) {
     this.marks1 = marks1;
     this.marks2 = marks2;
     this.marks3 = marks3;
 }

 @Override
 double getPercentage() {
     
     int totalMarks = marks1 + marks2 + marks3;
     return (totalMarks / 300.0) * 100;
 }
}

class B extends Marks {
 private int marks1, marks2, marks3, marks4;

 
 public B(int marks1, int marks2, int marks3, int marks4) {
     this.marks1 = marks1;
     this.marks2 = marks2;
     this.marks3 = marks3;
     this.marks4 = marks4;
 }

 @Override
 double getPercentage() {
     
     int totalMarks = marks1 + marks2 + marks3 + marks4;
     return (totalMarks / 400.0) * 100;
 }
}


public class student_31 {
 public static void main(String[] args) {
     
     A studentA = new A(85, 90, 78);
    
     B studentB = new B(88, 76, 92, 85);
     
  
     System.out.println("Percentage of student A: " + studentA.getPercentage() + "%");
     System.out.println("Percentage of student B: " + studentB.getPercentage() + "%");
 }
}
