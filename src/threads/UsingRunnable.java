package threads;

public class UsingRunnable implements Runnable {
	
public void run()//providing implementation for run method
{
	Thread t1=Thread.currentThread();
	String threadName=t1.getName();
	for (int i = 0; i <6; i++) 
	{
		System.out.println(threadName+" :i ="+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	System.out.println("After main method...");
	
	UsingRunnable s1=new UsingRunnable();
	
	// s1 object won't treat as a thread it should pass through thread object
	
	Thread th1=new Thread(s1);//now our UsingRunnable class became a thread 
	
	th1.setName("th1-thread");
	th1.start();
	
Thread th2=new Thread(s1);//now our UsingRunnable class became a thread 
	
	th2.setName("th2-thread");
	th2.start();
	
	UsingThread OT=new UsingThread();
	OT.start();
	
	
	System.out.println("main method is end..");

}

}
