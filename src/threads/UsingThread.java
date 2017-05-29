package threads;

public class UsingThread extends Thread{
	
public void run(){//we have to over ride run method
	
	Thread t1=Thread.currentThread();
	
	String threadName=t1.getName();
	
	for (int i = 10; i <16; i++) {
		System.out.println(threadName+" :i ="+i);
		
				try {
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
	}
	
}
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("After main method...");
	
	UsingThread s1=new UsingThread();
	s1.setName("th 1");
	s1.start();
	
	
	UsingThread s2=new UsingThread();
	
	s2.setName("th 2");
		s2.start();
	
		System.out.println("main method is end..");

}
}
