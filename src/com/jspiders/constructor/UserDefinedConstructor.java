package com.jspiders.constructor;

public class UserDefinedConstructor {
	
	UserDefinedConstructor(int a){
		System.out.println("user defined constructor..."+a);
	}
	
	public static void main(String[] args) {
		UserDefinedConstructor s=new UserDefinedConstructor(34);
		}
}