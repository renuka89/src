package com.jspiders.casting;

public class RuntimePoly {//dynamic dispatch
 void wish(){
	System.out.println("hi..");
}
}
class Sample extends RuntimePoly{
	void wish(){
		System.out.println("hello..");
	}
}
class Main1{
	public static void main(String[] args) {
		
		RuntimePoly s=new Sample();
		s.wish();
	}
}