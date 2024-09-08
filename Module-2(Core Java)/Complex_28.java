package assignment;

import java.util.Scanner;

class Complex_28 {
    private double real;
    private double imag;

 
    public Complex_28(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public Complex_28 add(Complex_28 other) {
        return new Complex_28(this.real + other.real, this.imag + other.imag);
    }

    
    public Complex_28 subtract(Complex_28 other) {
        return new Complex_28(this.real - other.real, this.imag - other.imag);
    }

    
    public Complex_28 multiply(Complex_28 other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex_28(realPart, imagPart);
    }

    
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("For the first complex number:");
        System.out.print("Enter the real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imag1 = scanner.nextDouble();
        Complex_28 c1 = new Complex_28(real1, imag1);

      
        System.out.println("For the second complex number:");
        System.out.print("Enter the real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imag2 = scanner.nextDouble();
        Complex_28 c2 = new Complex_28(real2, imag2);

        
        Complex_28 sum = c1.add(c2);
        Complex_28 difference = c1.subtract(c2);
        Complex_28 product = c1.multiply(c2);

      
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();
    }
}
