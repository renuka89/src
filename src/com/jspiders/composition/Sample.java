package com.jspiders.composition;

public class Sample {
//one object is made up of different object is said as composition
	int k=4;
	void test(){
		System.out.println("running test method......");
	}
}
//-----------------
class Sample1{
	Sample ref=new Sample();

	double q=5.5;
	void test1(){
		
		System.out.println("running test1 method........");
	}
	public static void main(String[] args) {
		
		Sample1 ref1=new Sample1();
		
		System.out.println(ref1.q);
		ref1.test1();
		System.out.println(ref1.ref.k);
		ref1.ref.test();
	}
	
}
