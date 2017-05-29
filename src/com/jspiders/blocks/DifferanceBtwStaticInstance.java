package com.jspiders.blocks;

public class DifferanceBtwStaticInstance {
	static int stdRolNo=12;
	int a=98;

public static void main(String[] args) {
	
	System.out.println(stdRolNo);//static
	
	DifferanceBtwStaticInstance.stdRolNo=13;//changing static value(re-initializing)
	
	System.out.println(stdRolNo);
	System.out.println("----------------");
	
	DifferanceBtwStaticInstance sd=new DifferanceBtwStaticInstance();
	System.out.println(sd.a);
	sd.a=23;//changing non static value
	System.out.println(sd.a);
	
	DifferanceBtwStaticInstance cs=new DifferanceBtwStaticInstance();
	System.out.println(cs.a);
}
}
