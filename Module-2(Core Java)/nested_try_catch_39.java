package assignment;

public class nested_try_catch_39{

    public static void main(String[] args) {
        try {
           
            try {
            
                int[] a = new int[5];
                
           
                a[5] = 30 / 0; 

            } catch (ArithmeticException e) {
                
                System.out.println("Inner catch block: Error - Division by zero is not allowed.");
                
            } catch (ArrayIndexOutOfBoundsException e) {
             
                System.out.println("Inner catch block: Error - Array index is out of bounds.");
                
            } finally {
              
                System.out.println("Inner finally block: Operation in inner block completed.");
            }
        
        } catch (Exception e) {
        
            System.out.println("Outer catch block: An unexpected error occurred.");
            
        } finally {
          
            System.out.println("Outer finally block: Operation in outer block completed.");
        }
    }
}
