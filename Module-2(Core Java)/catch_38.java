package assignment;

public class catch_38 {

    public static void main(String[] args) {
        try {
            
            int[] a = new int[5];
            
            
            a[5] = 30 / 0; 
            
        } catch (ArithmeticException e) {
           
            System.out.println("Error: Division by zero is not allowed.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
         
            System.out.println("Error: Array index is out of bounds.");
            
        } finally {
       
            System.out.println("Operation completed.");
        }
    }
}
