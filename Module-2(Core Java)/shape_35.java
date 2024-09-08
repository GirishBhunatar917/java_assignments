package assignment;


class Shapes {
 
 public static void printShape() {
     System.out.println("This is a shape");
 }
}

class Rectangles extends Shapes {
 
 public void printRectangle() {
     System.out.println("This is a rectangular shape");
 }
}


class Circles extends Shapes {
 
 public void printCircle() {
     System.out.println("This is a circular shape");
 }
}


class squares extends Rectangles{
 
 public void printsquares() {
     System.out.println("squares is a rectangle");
 }
}

public class shape_35 {
 public static void main(String[] args) {
    
     Shapes s= new Shapes();
     
    
     
     Shapes.printShape(); 
    
 }
}
