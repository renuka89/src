package com.overloading;

public class UsingFinal {
final int a=34;
final void m(int a){
	System.out.println(a);
}
final int  m(double a){
	System.out.println(a);
	return 34;
}
public static void main(String[] args) {
	UsingFinal s1=new UsingFinal();
	UsingFinal s2=new UsingFinal();

s1.m(5);
s2.m(53.4);
}
}
