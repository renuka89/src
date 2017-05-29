package threads;

public class Sample {
void m(){
	for (int i = 0; i <5; i++) {
		i+=2;
	}
}
void n(){
	for (int i =5; i <10; i++) {
		i=i+2;
		System.out.println(i);
	}
}
}
class Sample3{
public static void main(String[] args) {
	
	final Sample s =new Sample();
	
	new Thread(){  
		public void run(){
		s.n();
			
			}  
		}.start(); 
		
		
}
}
