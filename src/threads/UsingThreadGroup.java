package threads;

public class UsingThreadGroup implements Runnable{  
    public void run() {  
        System.out.println(Thread.currentThread().getName());  
  }  
 public static void main(String[] args) {  
	 UsingThreadGroup runnable = new UsingThreadGroup();  
        ThreadGroup th1 = new ThreadGroup("Parent ThreadGroup");  
          
        Thread t1 = new Thread(th1, runnable,"one");  
        t1.start();  
        Thread t2 = new Thread(th1, runnable,"two");  
        t2.start();  
        Thread t3 = new Thread(th1, runnable,"three");  
        t3.start();  
             
        System.out.println("Thread Group Name: "+th1.getName());  
       th1.list();  

  }  
 }  