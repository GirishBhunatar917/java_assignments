package assignment;

public class arethmetic_40 {

    public static void main(String[] args) {
        try {
           
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two numbers as command line arguments.");
            }
            
        
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

          
            int result = numerator / denominator; 
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
       
            System.out.println("Error: Cannot divide by zero.");

        } catch (NumberFormatException e) {
           
            System.out.println("Error: Please provide valid integers.");

        } catch (IllegalArgumentException e) {
         
            System.out.println(e.getMessage());

        } catch (Exception e) {
          
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
          
            System.out.println("Operation completed.");
        }
    }
}
