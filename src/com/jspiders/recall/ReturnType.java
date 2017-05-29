package com.jspiders.recall;

public class ReturnType {
static int method(){
	System.out.println("running static method");
	return 5*5;
}
public static void main(String[] args) {
	int x=method();
	System.out.println("print return value  "+x);
}
}
