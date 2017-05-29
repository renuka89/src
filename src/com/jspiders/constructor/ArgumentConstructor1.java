package com.jspiders.constructor;

public class ArgumentConstructor1 {
	
	
	ArgumentConstructor1(int i,String name){
		System.out.println(i+"  "+ name);
	}
	
	public static void main(String[] args) {
		ArgumentConstructor1 af=new ArgumentConstructor1(403,"renuka");
	}
}
