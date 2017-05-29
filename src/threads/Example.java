package threads;


public class Example {
	
	    void  resource(){
		Thread curth=Thread.currentThread();
		curth.setName("Th 1");
		String name=curth.getName();
				for (int i = 0; i <5; i++) {
			System.out.println(name+" :i = "+i);
		
		}
	}
	  
	   void resource1(){
		 Thread curth=Thread.currentThread();
		 curth.setName("Th 2");
		 String name=curth.getName();
					 for (int j = 0; j <5; j++) {
			System.out.println(name+ " :j = "+j);
						}
	 }
	}

	class ThreadB extends Thread{
		
		Example ref;//global
		
		ThreadB(Example ref1){
			this.ref=ref1;
		}
	public void run(){
		ref.resource();
			ref.resource1();
		}
	}
	class Demo3{
		public static void main(String[] args) {
			
			Example ref1=new Example();
			
			ThreadB ref2=new ThreadB(ref1);
		
			ref2.start();

					}
	}