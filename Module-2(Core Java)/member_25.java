package assignment;


class Member {

 private String name;
 private int age;
 private String phoneNumber;
 private String address;
 private double salary;

 
 public Member(String name, int age, String phoneNumber, String address, double salary) {
     this.name = name;
     this.age = age;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.salary = salary;
 }

 
 public void printSalary() {
     System.out.println("Salary of " + name + " is: " + salary);
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

 public String getPhoneNumber() {
     return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }
}

public class member_25 {
 public static void main(String[] args) {
     
     Member member = new Member("John Doe", 30, "123-456-7890", "123 Main St", 50000.00);
     member.printSalary();  
 }
}
