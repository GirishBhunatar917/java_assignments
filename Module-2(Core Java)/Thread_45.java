package assignment;


class MyThread extends Thread {
 
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


public class Thread_45 {
 
 public static void main(String[] args) {
     
     MyThread myThread = new MyThread();
     
    
     myThread.start();
     
     
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
