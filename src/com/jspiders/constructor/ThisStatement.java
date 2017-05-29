package com.jspiders.constructor;

public class ThisStatement {
	
	ThisStatement(int a){
		int mul=a*a;
		System.out.println("mutiplication of a :"+ mul);
	}
	ThisStatement(){
		this(5);
		System.out.println("zero argument constructor");
	}
	public static void main(String[] args) {
		//ThisStatement ref1=new ThisStatement(6);
		ThisStatement ref=new ThisStatement();
	}
}
