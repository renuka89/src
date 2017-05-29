package com.jspiders.inheritance;

public class SampleA1 {
int a=23; 
void m(){
	System.out.println("m method..");
}
}

class SampleA2  extends SampleA1{
	
	public static void main(String[] args) {
		SampleA2 sa=new SampleA2();
		System.out.println(sa.a);
		sa.m();
		
	}
}