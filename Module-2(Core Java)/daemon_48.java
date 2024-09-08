package assignment;



class TestDaemonThread2 extends Thread {
 private volatile boolean running = true;

 @Override
 public void run() {
     while (running) {
         System.out.println(Thread.currentThread().getName() + " is running.");
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println(Thread.currentThread().getName() + " interrupted.");
             Thread.currentThread().interrupt();
         }
     }
     System.out.println(Thread.currentThread().getName() + " has stopped.");
 }

 
 public void stopRunning() {
     running = false;
 }
}


public class daemon_48{
 public static void main(String[] args) {
    
     TestDaemonThread2 t1 = new TestDaemonThread2();
     TestDaemonThread2 t2 = new TestDaemonThread2();

     
     t1.setDaemon(true);

 
     t1.start();
     t2.start();

     
     System.out.println("t1 is daemon: " + t1.isDaemon());
     System.out.println("t2 is daemon: " + t2.isDaemon());

     
     try {
         Thread.sleep(5000); 
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

    
     t2.stopRunning(); 
     try {
         t2.join(); 
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted while waiting for t2.");
     }

     System.out.println("Main thread finishing.");
     
 }
}
