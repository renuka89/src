package com.jspiders.constructor;

public class Sample1 {
	Sample1(){

		System.out.println("zero argument");
	}
	
	Sample1(int a){
		this(3,3.3);

		System.out.println("int  argument constructor");

	}
	Sample1(int a,double dl){
		this();
		System.out.println("two  argument constructor");

	}
	
	public static void main(String[] args) {
		Sample1 s=new Sample1(23);
	}
	
}
