package assignment;

public class PrintDetails_22{

    
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    
    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
       
        PrintDetails_22 pd = new PrintDetails_22();

        // Test the methods
        pd.print(42, 'A');  
        pd.print('B', 99);  
    }
}
