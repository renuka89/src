package com.jspiders.recall;

public class StaticMethodWithMoreArg {
static void n(int a,int b,int c){
	System.out.println("a value "+a);
	System.out.println("b value "+b);
	System.out.println("c value "+c);
}
public static void main(String[] args) {
	StaticMethodWithMoreArg.n(5, 6, 7);
}
}
