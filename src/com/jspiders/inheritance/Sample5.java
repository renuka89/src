package com.jspiders.inheritance;

public class Sample5 {
	int a=78;
	Sample5(int a){
		System.out.println("super class constructor :"+a);
	}
}
class Sample6 extends Sample5{
	Sample6(){
		super(67);
		System.out.println("sub  class constructor");

	}
	void m(){
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		
		Sample6 s=new Sample6();
		s.m();
	}
}