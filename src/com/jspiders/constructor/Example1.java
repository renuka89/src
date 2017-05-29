package com.jspiders.constructor;

public class Example1 {
int a=12;

void m(){
	System.out.println("m method..");
}

public static void main(String[] args) {
	Example1 ex=new Example1();
	System.out.println(ex.a);
	
	ex.m();
}
}
