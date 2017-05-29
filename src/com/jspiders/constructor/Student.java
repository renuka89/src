package com.jspiders.constructor;

public class Student {
	
	String name;//global variables
	String loc;
	int rollNo;
	
	Student(String name,String loc,int regNo ){
		this.name=name;
		this.loc=loc;
		this.rollNo=regNo;
	}
	
	void test(){
		System.out.println(name+"  taking test..");
	}
	
	void form(){
		System.out.println("filling the form");
		System.out.println(name+"  "+loc+"  "+rollNo);
	}
public static void main(String[] args) {
	
Student  st=new Student("renuka","belgum",403);
	st.test();
	System.out.println("--------------------------");
	st.form();
}
}
