package com.jspiders.blocks;

public class Sample1 {
static int i;//only delacred
	 //Static blocks will executed only once
int j;

{
	j=7;
	System.out.println(j);
	System.out.println("@@@@@@@@@@");
}

static{
	
System.out.println("$$$$$$$$$$$$");	
i=9;//initializing value

}
public static void main(String[] args) {
	{
		System.out.println("???????????????????");
	}
	Sample1 n=new Sample1();
	System.out.println("i value "+Sample1.i);
	
	Sample1 n1=new Sample1();
}
}
