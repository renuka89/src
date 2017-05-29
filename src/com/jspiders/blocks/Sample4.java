package com.jspiders.blocks;

public class Sample4 {
static{
	System.out.println("running static block1");
}
static{
	System.out.println("running static block2");
}

{
	System.out.println("running instance block1...s");
}
{
	System.out.println("running instance block2...s");

}
public static void main(String[] args) {
	

	{
		System.out.println("runnin..main method");
	}
	Sample4 s=new Sample4();

}
}
