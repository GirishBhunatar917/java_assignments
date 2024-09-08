package assignment;


class TestThreadTwice1 extends Thread {
 @Override
 public void run() {
     System.out.println(Thread.currentThread().getId() + " is running.");
     try {
         Thread.sleep(2000); 
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted.");
     }
 }
}


public class Thread_47 {
 public static void main(String[] args) {
     
     TestThreadTwice1 t1 = new TestThreadTwice1();

     try {
        
         t1.start();

     
         t1.start();
     } catch (IllegalThreadStateException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
