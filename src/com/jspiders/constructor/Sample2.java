package com.jspiders.constructor;

public class Sample2 {
	static int count=0;
	Sample2(){
		System.out.println("running zero zrgument constructor");
		count++;
	}
	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			new Sample2();
		}
		System.out.println("number of times constructor runs:"+count);
	}
	
}
