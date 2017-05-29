package com.jspiders.inheritance;

public class SampleA {
	SampleA(int a){
		System.out.println("Super class constructor : "+a);
	}
void m(){
	System.out.println("m method....");
}
}
class SampleB extends SampleA{
	SampleB(){
		super(3);
	}
	public static void main(String[] args) {
		SampleB b=new SampleB();
	}
}