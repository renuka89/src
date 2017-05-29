package com.check;

public class Sample2 extends Sample {
int test(){
		System.out.println("test2....");
		return 2;
	}
	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		s2.test();
	}
}
