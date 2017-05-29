package com.jspiders.exceptions;

public class UsingThrow {
	
void method(int age){
	if (age<18) {
		System.out.println("eligible for voting");

		throw new ArithmeticException();

	}else{
		System.out.println("eligible for voting");
	}
}
public static void main(String[] args) {
	
	UsingThrow s1=new UsingThrow();
try{

	s1.method(15);

	}catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println("hii idiot enter proper age");

	}finally{
		System.out.println("#####################");
	}
}
}
