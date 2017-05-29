package com.jspiders.methods;

public class Student1 {
	
	Student1(){
		System.out.println("zero argument");
	}
	
	Student1(String name){
		this();
		System.out.println("Student name : " +name);
	}
	
	public static void main(String[] args) {
		
		Student1 s=new Student1("Renuka");
		
	}
}
