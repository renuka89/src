package com.jspiders.recall;

public class StaticMethod {
	static void m(int a){
		System.out.println(a*a);
	}
public static void main(String[] args) {
	StaticMethod.m(5);
	StaticMethod.m(6);
}
}
