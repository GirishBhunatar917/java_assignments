package assignment;

import java.lang.Math;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    
    public Triangle() {
       
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Method to calculate the area using Heron's formula
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    public void printDetails() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
    }
}

public class triangle_27 {
    public static void main(String[] args) {
      
        Triangle triangle = new Triangle();
        
     
        triangle.printDetails();
    }
}
