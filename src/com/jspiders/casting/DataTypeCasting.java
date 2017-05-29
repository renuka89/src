package com.jspiders.casting;

public class DataTypeCasting {
	
	char m(int a){
		System.out.println("a values : "+a);
		
		return (char) a;
	}
	
	
	public static void main(String[] args) {
		DataTypeCasting c=new DataTypeCasting();
		
		float b=c.m('q');
		
		System.out.println(b);
		
		System.out.println(c.m('q'));
	}
}
