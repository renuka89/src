package com;

public class Blocks1 {
	int a;
	{
		
		System.out.println("running instance block");
	}
static {
	System.out.println("running static block1");
}
static{
	System.out.println("running static block");

}


{
	System.out.println("running instance block1");

}

public static void main(String[] args) {
	Blocks1 b=new Blocks1();
	System.out.println(b.a);
	{
		System.out.println("main block");
	}
}
}
