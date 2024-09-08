package assignment;

class MyRunnable implements Runnable {
 
 @Override
 public void run() {
     
     for (int i = 0; i < 5; i++) {
         System.out.println("Thread running: " + i);
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}


public class Thread_44 {
 
 public static void main(String[] args) {
    
     MyRunnable myRunnable = new MyRunnable();
     
    
     Thread thread = new Thread(myRunnable);
     
     
     thread.start();
     
    
     for (int i = 0; i < 5; i++) {
         System.out.println("Main thread running: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted");
         }
     }
 }
}
