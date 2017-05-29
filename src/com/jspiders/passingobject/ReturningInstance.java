package com.jspiders.passingobject;

public class ReturningInstance {
int d=40;
void n(){
	System.out.println("running the n method..");
}
}
//-------------------------------
class Sample1 {
	
	 ReturningInstance returnObject() {
		 
		ReturningInstance RI=new ReturningInstance();
		
		//RI.d=89;
		// TODO Auto-generated method stub
		return RI;
	}
	
public static void main(String[] args) {
	
	Sample1 s1=new Sample1();
	
	ReturningInstance ref=s1.returnObject();//storing the return instance in ref
	System.out.println(ref.d);
	ref.n();
	}
}
