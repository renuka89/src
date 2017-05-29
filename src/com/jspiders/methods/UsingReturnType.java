package com.jspiders.methods;

public class UsingReturnType {
	
	
String m(String st){
	
	return st;
}
int add(int a,int b){
	
	return (a+b);
	
}
public static void main(String[] args) {
	
	UsingReturnType ref=new UsingReturnType();//instance
	
	String w=ref.m("naveen");
	
	System.out.println(w);
	
	int sum=ref.add(7, 9);
	System.out.println(sum);
}
}
