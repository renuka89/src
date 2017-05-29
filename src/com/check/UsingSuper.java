package com.check;

public class UsingSuper extends Example{

	UsingSuper()
	{
		super(5.5);
		System.out.println("running sub class constructor");
	}
	public static void main(String[] args) {
		
		//Example e1=new Example(4.4);
		UsingSuper us=new UsingSuper();
	}
}
