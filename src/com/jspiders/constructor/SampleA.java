package com.jspiders.constructor;

public class SampleA {
	SampleA(){
		System.out.println("zero argument constructor..");
	}
	SampleA(int a){
		this();
		System.out.println("int argument constructor..");
	
	}
	SampleA(String st){
		this(4);
		System.out.println("String  argument constructor..");
	}
	public static void main(String[] args) {
		SampleA s=new SampleA(7);
		System.out.println("-----------------------");
		SampleA s1=new SampleA(" java");

	}
}

