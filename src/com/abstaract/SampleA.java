package com.abstaract;

public abstract class SampleA {
void m(){
	System.out.println("m method...");
}
abstract void n();
}


class B extends SampleA{

	@Override
void n() {
System.out.println("providing new implementation..");		
	}
	public static void main(String[] args) {
		B s=new B();
		
		s.m();
		s.n();
		
		System.out.println("-------------");
		SampleA s1=new B();//upcasting
		s1.m();
		s1.n();
	}
	
}
