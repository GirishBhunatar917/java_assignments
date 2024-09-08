package assignment;

import java.util.regex.Pattern;

class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}


class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}




public class student_43 {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public student_43(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
     
     // Validate age
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
     }
     
 
     if (!Pattern.matches("^[A-Za-z ]+$", name)) {
         throw new NameNotValidException("Name should not contain numbers or special symbols.");
     }
 }
 

 public int getRollNo() {
     return rollNo;
 }

 public void setRollNo(int rollNo) {
     this.rollNo = rollNo;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getCourse() {
     return course;
 }

 public void setCourse(String course) {
     this.course = course;
 }
 
 @Override
 public String toString() {
     return "Student[rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
 }

 // Main method for testing
 public static void main(String[] args) {
     try {
    	 student_43 student = new student_43(1, "John Doe", 20, "Mathematics");
         System.out.println("Student created successfully: " + student);
     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println(e.getMessage());
     }
 }
}
