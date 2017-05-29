package com.jspiders.passingobject;

public class Demo1PO {
	
	public static void main(String[] args) {
		PassByObject PO=new PassByObject();
		PO.k=50;//re-initializing
		Demo d1=new Demo();
		
		d1.useInstance(PO);
	}
}
