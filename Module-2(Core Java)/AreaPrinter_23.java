package assignment;

public class AreaPrinter_23 {

    
    public void printArea(double side) {
        double area = side * side;
        System.out.println("Area of the square with side " + side + " is: " + area);
    }

   
    public void printArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }

    public static void main(String[] args) {
        
        AreaPrinter_23 printer = new AreaPrinter_23();

        
        printer.printArea(5.0);           
        printer.printArea(4.0, 6.0);
    }
}
