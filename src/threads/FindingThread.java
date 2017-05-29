package threads;

public class FindingThread {
public static void main(String[] args) {
	
	Thread th=new Thread();
	
	Thread nm=th.currentThread();
	
	System.out.println(nm.getName());
	
}
}
