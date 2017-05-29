package threads;

public class Sample2  implements Runnable {

	@Override
	public void run() {
System.out.println("providing implementation for run method...");
	}
public static void main(String[] args) {
	
	Sample2 s=new Sample2();
	
	Thread th=new Thread(s);
	
	th.start();
	

	
}
}
