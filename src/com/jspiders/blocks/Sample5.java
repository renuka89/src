package com.jspiders.blocks;

public class Sample5 {
	
	static{
		System.out.println("!!!!!!!!!!!!!!!!!");
	}
	{
		System.out.println("###########");
	}
	static{
		System.out.println("@@@@@@@@@@@!");
	}
public static void main(String[] args) {
	System.out.println("running main method");
	
	Sample5 ref=new Sample5();
}
}
