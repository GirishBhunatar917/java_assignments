package assignment;


class MyThreads extends Thread {
 private String threadName;

 public MyThreads(String name) {
     this.threadName = name;
 }

 @Override
 public void run() {
     System.out.println(threadName + " started.");
     try {
         Thread.sleep(2000); 
     } catch (InterruptedException e) {
         System.out.println(threadName + " interrupted.");
     }
     System.out.println(threadName + " finished.");
 }
}

//Main class to execute the threads
public class Thread_46 {
 public static void main(String[] args) {
    
     MyThreads thread1 = new MyThreads("Thread 1");
     MyThreads thread2 = new MyThreads("Thread 2");

    
     thread1.start();
     thread2.start();

     
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Both threads have finished execution.");
 }
}
