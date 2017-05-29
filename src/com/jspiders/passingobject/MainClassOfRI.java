package com.jspiders.passingobject;

public class MainClassOfRI {
	
public static void main(String[] args) {
	
	Sample RI1=new Sample();
	
	ReturningInstance ref=new ReturningInstance();
	
			ref=RI1.returnObject();//storing the return instance in ref
	System.out.println("d value :"+ref.d);
	
	ref.n();
}
}
