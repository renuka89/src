package threads;

public class Sample1 extends Thread{
	public void run(){
		System.out.println("over riding run method...");
	}
	public static void main(String[] args) {
		
		Sample1 s=new Sample1();
	s.start();
	
	Sample1 s1=new Sample1();

	s1.start();
	}
}