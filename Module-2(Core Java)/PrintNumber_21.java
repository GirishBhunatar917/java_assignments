package assignment;

public class PrintNumber_21 {

    
    public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    
    public void printn(double number) {
        System.out.println("Double: " + number);
    }

  
    public void printn(float number) {
        System.out.println("Float: " + number);
    }

   
    public void printn(long number) {
        System.out.println("Long: " + number);
    }


    public void printn(short number) {
        System.out.println("Short: " + number);
    }

    
    public void printn(byte number) {
        System.out.println("Byte: " + number);
    }

    public static void main(String[] args) {
       
        PrintNumber_21 printer = new PrintNumber_21();

     
        printer.printn(10);    
        printer.printn(10.5); 
        printer.printn(10.5f);    
        printer.printn(100000L);  
        printer.printn((short) 10); 
        printer.printn((byte) 10);  
    }
}
