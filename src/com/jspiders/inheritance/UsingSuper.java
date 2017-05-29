package com.jspiders.inheritance;

public class UsingSuper {
	int a=12;
	String st="super keyword";
	
	UsingSuper(int i){
		System.out.println(i);
		System.out.println("running super class constructor");
	}
	void m(){
		
	}

}
class Samp1  extends UsingSuper{
	/*by default sub class will consist a default constructor with super ststement i.e
	Samp1(){
		super();
	}
	*/
		
	Samp1(){
		super(45);
		System.out.println(super.a);
		System.out.println(super.st);
	}
	public static void main(String[] args) {
		Samp1 s1=new Samp1();
		System.out.println("running main method..");
	}
}
