package com.jspiders.blocks;

public class Example {

static
{
	int w=23;
	System.out.println("running static blocks.."+w);
}
static
{
	System.out.println("running static blocks..");
}
{
	System.out.println("running non static blocks..1");

}
{
	System.out.println("running non static blocks..2");

}
public static void main(String[] args) {
System.out.println("main method..");
Example e1=new Example();
Example e2=new Example();

	}

}
