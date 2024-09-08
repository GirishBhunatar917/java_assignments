package assignment;


class Rectangle {
    private double length;
    private double breadth;

    
    public Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Length and breadth must be positive values.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

  
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be a positive value.");
        }
    }

    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        } else {
            throw new IllegalArgumentException("Breadth must be a positive value.");
        }
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", breadth=" + breadth + "]";
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getLength() + "]";
    }
}

public class Rectangle_26 {
    public static void main(String[] args) {
    
        Rectangle rect = new Rectangle(5.0, 3.0);
        Square sq = new Square(4.0);

       
        System.out.println(rect);
        rect.printArea();
        rect.printPerimeter();

       
        System.out.println(sq);
        sq.printArea();
        sq.printPerimeter();
    }
}


