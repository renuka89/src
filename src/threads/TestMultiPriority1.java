package threads;

public class TestMultiPriority1 extends Thread{  
		 public void run(){
		Thread cuth= Thread.currentThread();
  System.out.println(cuth.getName() +"running and its priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 
		  TestMultiPriority1 m1=new TestMultiPriority1(); 
		  
		  TestMultiPriority1 m2=new TestMultiPriority1();
		  
		  TestMultiPriority1 m3=new TestMultiPriority1();
		  m1.setName("th-1");
		  m2.setName("th-2");
		  m3.setName("th -3");

		//  m1.setPriority(7);  

		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY); 
		  m3.setPriority(NORM_PRIORITY);
		  
		 
		  m1.start();  
		  m2.start();
		  m3.start();
		   
		 }  
		
}

