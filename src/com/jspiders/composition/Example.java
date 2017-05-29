package com.jspiders.composition;

public class Example {
	
void m(){
	System.out.println("running m method");
}
}

 class Example1{
	void n(){
		System.out.println("running n method");
	}
	Example ex=new Example();
}
 
 class MainClss{
	 public static void main(String[] args) {
		 Example1 ex1=new Example1();
		 
		 ex1.n();
		 ex1.ex.m();
	}
	 
 }