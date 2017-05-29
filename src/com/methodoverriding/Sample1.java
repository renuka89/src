package com.methodoverriding;

public class Sample1 {
	 int w=23;
	 void  m(){
		 System.out.println("running m method..");
	 }
Sample1(double d){
	System.out.println("sample 1 constructor  "+d);
}
}

class Sample2 extends Sample1{	
	
	Sample2(int q){
		super(3.3);////using super statement to invoke super class constructor
		System.out.println(super.w);//using super keyword to invoke super class data member
		System.out.println("sample 2 constructor  "+q);
super.m();//using super keyword to invoke super class methods
	}
}

class Sample3 extends Sample2{
	Sample3(){
		super(45);//using super statement to invoke super class constructor
		System.out.println("sample 3 constructor");

	}
	
	public static void main(String[] args) {
		
		Sample3 s3=new Sample3();
	}
}