package com.jspiders.passingobject;

public class Demo {
	
	void useInstance(PassByObject po){
		
		System.out.println("k value :"+po.k);
		po.m();
	}
	public static void main(String[] args) {
		
		PassByObject PO=new PassByObject();
		
		//PO.k=50;//re-initializing
		
		Demo d1=new Demo();
		
		d1.useInstance(PO);
	}
}
